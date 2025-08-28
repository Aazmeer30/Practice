package Rational;

public class TestRational {
    public static void main(String[] args) {
        // Creating Rational objects
        Rational r1 = new Rational(1, 2); // 1/2
        Rational r2 = new Rational(3, 4); // 3/4

        // Performing arithmetic operations
        System.out.println("r1 + r2 = " + r1.add(r2));       
        System.out.println("r1 - r2 = " + r1.subtract(r2)); 
        System.out.println("r1 * r2 = " + r1.multiply(r2)); 
        System.out.println("r1 / r2 = " + r1.divide(r2)); 
    }
}

