package Turtle;  
// "package" groups related classes.  
// This file is in the "Turtle" folder inside src.

public class Turtle {  
    // "public" means this class is visible to other classes in the project.
    // "class" defines a blueprint for creating Turtle objects.

    private int x, y;   // "private" = only accessible inside this class.
                        // x,y represent position of the turtle.
    private int dir;    // 0 = North, 1 = East, 2 = South, 3 = West

    public Turtle() {  
        // Constructor (special method to initialize objects)
        this.x = 0;     // "this" refers to the current object’s variable.
        this.y = 0;
        this.dir = 0;   // Start facing North.
    }

    // Method to process a string of commands
    public void process(String commands) {
        // "for-each loop" -> iterates over each character in the string
        for (char c : commands.toCharArray()) {
            // "switch" chooses action depending on character
            switch (c) {
                case 'F': moveForward(); break; // If 'F', call moveForward()
                case 'L': turnLeft(); break;    // If 'L', call turnLeft()
                case 'R': turnRight(); break;   // If 'R', call turnRight()
                default: System.out.println("Invalid command: " + c);
            }
        }
    }

    private void moveForward() {
        // Move depending on direction
        switch (dir) {
            case 0: y++; break; // North -> increase y
            case 1: x++; break; // East -> increase x
            case 2: y--; break; // South -> decrease y
            case 3: x--; break; // West -> decrease x
        }
    }

    private void turnLeft() {
        dir = (dir + 3) % 4;  // Rotate left by subtracting 1 (mod 4 keeps range 0-3)
    }

    private void turnRight() {
        dir = (dir + 1) % 4;  // Rotate right by adding 1
    }

    public String getPosition() {
        // "return" sends back a String with current position
        return "(" + x + ", " + y + ") facing " + directionName();
    }

    private String directionName() {
        // "switch expression" (Java 14+ feature)
        return switch (dir) {
            case 0 -> "North";
            case 1 -> "East";
            case 2 -> "South";
            case 3 -> "West";
            default -> "Unknown";
        };
    }
}
