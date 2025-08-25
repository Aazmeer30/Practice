package Week_07.Nth_Dimesional;

// Import Vector class
public class Main {
    public static void main(String[] args) {

        // Create two 4D vectors
        Vector v1 = new Vector(1.0, 2.0, 3.0, 4.0);
        Vector v2 = new Vector(5.0, 6.0, 7.0, 8.0);

        // Print vectors
        System.out.println("v1: " + v1);
        System.out.println("v2: " + v2);

        // Add vectors
        Vector sum = v1.add(v2);
        System.out.println("v1 + v2: " + sum);

        // Clone a vector
        Vector copy = v1.clone();
        System.out.println("Clone of v1: " + copy);

        // Check equality
        System.out.println("v1 equals copy? " + v1.equals(copy));

        // Iterate vector
        System.out.print("Iterating v2: ");
        for (double val : v2) {
            System.out.print(val + " ");
        }
    }
}
