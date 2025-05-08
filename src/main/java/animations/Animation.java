package animations;

import shapes.*;

public interface Animation {
    void apply(Shape2D shape);
    double getExtraArea(); // area occupied during animation
}
