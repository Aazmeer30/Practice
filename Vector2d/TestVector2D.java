package Vector2d;

public class TestVector2D {
    public static void main(String[] args) {
        // Create two Vector2D objects
        Vector2D v1 = new Vector2D(3, 4); // vector (3,4)
        Vector2D v2 = new Vector2D(1, 2); // vector (1,2)

        // Add vectors
        Vector2D sum = v1.add(v2); 
        System.out.println("v1 + v2 = " + sum); // prints (4.0, 6.0)

        // Subtract vectors
        Vector2D diff = v1.subtract(v2);
        System.out.println("v1 - v2 = " + diff); // prints (2.0, 2.0)

        // Dot product
        double dot = v1.dot(v2);
        System.out.println("v1 · v2 = " + dot); // prints 11.0

        // Magnitude of v1
        double mag = v1.magnitude();
        System.out.println("Magnitude of v1 = " + mag); // prints 5.0
    }
}
