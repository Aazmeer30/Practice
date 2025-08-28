package Vector2d; 
// "package" groups related classes. 
// This class is in the Vector2D folder/package.

public class Vector2D {
  
    private double x, y;  
   
    // Constructor: called when a new Vector2D object is created
    public Vector2D(double x, double y) {
        this.x = x;  
        this.y = y;
    }

    // Getter for x
    public double getX() {
        return x; // returns the x component of the vector
    }

    // Getter for y
    public double getY() {
        return y; // returns the y component of the vector
    }

    // Method to add two vectors
    public Vector2D add(Vector2D v) {
        return new Vector2D(this.x + v.x, this.y + v.y);
        // Example: (3,4) + (1,2) → new Vector2D(4,6)
    }

    // Method to subtract two vectors
    public Vector2D subtract(Vector2D v) {
        // Subtract components and return a new vector
        return new Vector2D(this.x - v.x, this.y - v.y);
        // Example: (3,4) - (1,2) → new Vector2D(2,2)
    }

    // Method to multiply vector by a scalar
    public Vector2D scale(double scalar) {
        // Multiply both components by scalar and return new vector
        return new Vector2D(this.x * scalar, this.y * scalar);
        // Example: (3,4) * 2 → new Vector2D(6,8)
    }

    public double dot(Vector2D v) {
        // Dot product formula: x1*x2 + y1*y2
        return this.x * v.x + this.y * v.y;
        // Example: (3,4) · (1,2) → 3*1 + 4*2 = 11
    }   
    public double magnitude() {
        // Magnitude formula: sqrt(x^2 + y^2)
        return Math.sqrt(x * x + y * y);
       Example: sqrt(3^2 + 4^2) = sqrt(9+16) = 5
    }

    // Convert vector to string for easy printing
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
        // Example: (3.0, 4.0)
    }
}

