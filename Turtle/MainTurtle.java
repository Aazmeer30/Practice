package Turtle;  
// Main program file (entry point)

public class MainTurtle {
    public static void main(String[] args) {
        // "main" is the starting method of every Java program.
        // "String[] args" = command-line arguments.

        Turtle t = new Turtle();   // Create object "t" of class Turtle

        t.process("FFRFFLFF");     // Call method "process" with a command string

        System.out.println(t.getPosition()); 
        // Print final position
    }
}
