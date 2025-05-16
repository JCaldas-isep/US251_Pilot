package domain;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class DSLGenerator {

    private final Map<String, Shape> shapes;

    public DSLGenerator(Map<String, Shape> shapes) {
        this.shapes = shapes;
    }

    public String generate() {
        StringBuilder sb = new StringBuilder();
        sb.append("DSL version 1.1.23;\n\n");
        sb.append("DroneType droneTypeA;\n\n");

        Set<String> declaredPositions = new HashSet<>();
        StringBuilder declarations = new StringBuilder();
        StringBuilder body = new StringBuilder();

        Map<String, String> positionNames = new HashMap<>();
        AtomicInteger posCounter = new AtomicInteger();

        for (Shape shape : shapes.values()) {
            String shapeId = shape.getCustomID();
            Position startPos = shape.getOriginalPosition();
            String shapeClass = shape.getType().toString().substring(0, 1).toUpperCase() +
                    shape.getType().toString().substring(1).toLowerCase();

            String posKey = startPos.toString();
            String posName = positionNames.computeIfAbsent(posKey, k -> "pos" + (posCounter.incrementAndGet()));
            if (!declaredPositions.contains(posKey)) {
                declarations.append("Position ").append(posName).append(" = ")
                        .append(startPos.toTuple()).append(";\n");
                declaredPositions.add(posKey);
            }

            declarations.append("Distance length").append(shapeId).append(" = 10;\n"); // or based on some heuristic

            declarations.append(shapeClass)
                    .append(" ")
                    .append(shapeId)
                    .append("(")
                    .append(posName)
                    .append(", ")
                    .append("length").append(shapeId)
                    .append(", droneTypeA);\n\n");

            List<Animation> animations = shape.getAnimations();

            if (!animations.isEmpty()) {
                body.append("before\n");

                for (Animation animation : animations) {
                    if (animation instanceof Turn) {
                        body.append("\t").append(shapeId).append(".lightsOn(")
                                .append(((Turn) animation).getColour()).append(");\n");
                    } else if (animation instanceof Move) {
                        Position dest = ((Move) animation).getDestination();
                        double time = ((Move) animation).getTime();

                        String movePosKey = dest.toString();
                        String movePosName = positionNames.computeIfAbsent(movePosKey, k -> "pos" + (posCounter.incrementAndGet()));
                        if (!declaredPositions.contains(movePosKey)) {
                            declarations.append("Position ").append(movePosName).append(" = ")
                                    .append(dest.toTuple()).append(";\n");
                            declaredPositions.add(movePosKey);
                        }

                        declarations.append("Velocity vel").append(shapeId).append(" = ")
                                .append("5.0").append(";\n");

                        body.append("\t").append(shapeId)
                                .append(".move(")
                                .append(movePosName)
                                .append(", ")
                                .append((int) time)
                                .append(", vel").append(shapeId)
                                .append(");\n");
                    } else if (animation instanceof Rotate) {
                        Rotate rotate = (Rotate) animation;
                        String axis = rotate.getAxis();
                        int angle = rotate.getAngle();
                        double time = rotate.getTime();

                        declarations.append("Velocity rotVel").append(shapeId).append(" = PI/10;\n");
                        String axisName = axis + "Axis";
                        if (!declaredPositions.contains(axisName)) {
                            declarations.append("Position ").append(axisName).append(" = ");
                            if (axis.equals("x")) declarations.append("(1,0,0);\n");
                            else if (axis.equals("y")) declarations.append("(0,1,0);\n");
                            else declarations.append("(0,0,1);\n");
                            declaredPositions.add(axisName);
                        }

                        body.append("\t").append(shapeId)
                                .append(".rotate(")
                                .append(posName)
                                .append(", ")
                                .append(axisName)
                                .append(", ")
                                .append(angle == 360 ? "2*PI" : angle == 180 ? "PI" : angle + "º")
                                .append(", rotVel").append(shapeId)
                                .append(");\n");
                    } else if (animation instanceof Pause) {
                        double seconds = ((Pause) animation).getTime();
                        body.append("pause(").append((int) seconds).append(");\n");
                    }
                }
                body.append("endbefore\n\n");
            }

            body.append(shapeId).append(".lightsOff;\n\n");
        }

        return sb.append(declarations).append("\n").append(body).toString();
    }
}
