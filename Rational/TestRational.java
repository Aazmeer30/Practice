package Rational;

public class TestRational {
    public static void main(String[] args) {
        // Creating Rational objects
        Rational r1 = new Rational(1, 2); // 1/2
        Rational r2 = new Rational(3, 4); // 3/4

        // Performing arithmetic operations
        System.out.println("r1 + r2 = " + r1.add(r2));       // 1/2 + 3/4 = 5/4
        System.out.println("r1 - r2 = " + r1.subtract(r2));  // 1/2 - 3/4 = -1/4
        System.out.println("r1 * r2 = " + r1.multiply(r2));  // 1/2 * 3/4 = 3/8
        System.out.println("r1 / r2 = " + r1.divide(r2));    // 1/2 ÷ 3/4 = 2/3
    }
}
