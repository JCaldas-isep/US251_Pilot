grammar ShapeGrammar;

@header {
package antlr.grammar;
}

// Entry rule
program
    : (shapeBlock)+ EOF
    ;

shapeBlock
    : shapeDefinition animation*
    ;

// Shape definitions with updated SIZE syntax
shapeDefinition
    : shapeWithSingleSize
    | rectangleShape
    ;

shapeWithSingleSize
    : shapeTypeSingleSize ID '(' coordinateList ')' 'SIZE' sizeValue 'WITH' droneAmount 'DRONES'
    ;

rectangleShape
    : 'RECTANGLE' ID '(' coordinateList ')' 'SIZE' sizeValue ',' sizeValue 'WITH' droneAmount 'DRONES'
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

// MOVE shape_name TO <x, y, z> IN <time>
moveAnimation
    : 'MOVE' ID 'TO' '(' coordinateList ')' 'IN' time
    ;

// ROTATE shape_name BY <angle> ON axis IN time
rotateAnimation
    : 'ROTATE' ID 'BY' '<' angle '>' 'ON' axis 'IN' time
    ;

// TURN shape_name <colour> FOR time
turnAnimation
    : 'TURN' ID '<' colour '>' 'FOR' time
    ;

// PAUSE shape_name FOR time
pauseAnimation
    : 'PAUSE' ID 'FOR' time
    ;

// Shape types with a single size
shapeTypeSingleSize
    : 'SQUARE'
    | 'TRIANGLE'
    | 'HEXAGON'
    | 'CIRCLE'
    | 'LINE'
    ;

// Values
coordinate    : SIGNED_NUMBER ;
sizeValue     : SIGNED_NUMBER 'm';
droneAmount   : SIGNED_NUMBER ;
angle         : SIGNED_NUMBER 'º' ;
time          : SIGNED_NUMBER 's' ;
axis          : 'x' | 'y' | 'z' ;
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