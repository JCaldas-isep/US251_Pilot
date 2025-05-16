grammar ShapeGrammar;

@header {
package antlr.grammar;
}

// Entry rule
program
    : (shapeBlock)+ EOF
    ;

// A shape followed optionally by an animation
shapeBlock
    : shapeDefinition animation*
    ;

// domain.Shape Definition
shapeDefinition
    : shapeType ID '<' coordinateList '>' 'WITH' droneAmount
    ;

// Coordinate List
coordinateList
    : coordinate (',' coordinate)*
    ;

// Animations
animation
    : moveAnimation
    | rotateAnimation
    | turnAnimation
    | pauseAnimation
    ;

// MOVE shape_name <x, y, z> IN <time>
moveAnimation
    : 'MOVE' ID 'TO' '<' coordinateList '>' 'IN' time
    ;

// ROTATE shape_name <angle> ON <axis> IN <time>
rotateAnimation
    : 'ROTATE' ID 'BY' '<' angle '>' 'ON' axis 'IN' time
    ;

// TURN shape_name <colour>
turnAnimation
    : 'TURN' ID '<' colour '>'
    ;

// PAUSE shape_name FOR <time>
pauseAnimation
    : 'PAUSE' ID 'FOR' time
    ;

// domain.Shape Types
shapeType
    : 'SQUARE'
    | 'TRIANGLE'
    | 'HEXAGON'
    | 'CIRCLE'
    ;

// Values
coordinate      : SIGNED_NUMBER ;
droneAmount     : SIGNED_NUMBER ;
angle           : SIGNED_NUMBER 'º' ;
time            : SIGNED_NUMBER 's' ;
axis            : 'x' | 'y' | 'z' ;
colour
    : 'RED' | 'GREEN' | 'BLUE'
    | 'MAGENTA' | 'YELLOW' | 'CYAN' | 'WHITE'
    ;

// Tokens
ID              : [a-zA-Z_] [a-zA-Z_0-9]* ;
SIGNED_NUMBER   : '-'? DIGIT+ ;
DIGIT           : [0-9] ;

WS              : [ \t\r\n]+ -> skip ;
COMMENT         : '##' ~[\r\n]* -> skip ;
