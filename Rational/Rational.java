package Rational; 
public class Rational { 

    private int num; // numerator of the fraction
    private int den; // denominator of the fraction

    public Rational(int num, int den) {
        if (den == 0) 
            throw new IllegalArgumentException("Denominator cannot be zero!");
        
        int gcd = gcd(Math.abs(num), Math.abs(den));
        // Calculate greatest common divisor (GCD) to simplify fraction
        // Math.abs ensures gcd is positive

        this.num = num / gcd; // reduce numerator
        this.den = den / gcd; // reduce denominator

        if (this.den < 0) { 
            // Keep denominator positive
            this.num = -this.num;
            this.den = -this.den;
        }
    }

    // Recursive method to calculate GCD (Greatest Common Divisor)
    private int gcd(int a, int b) {
        return (b == 0) ? a : gcd(b, a % b);
        // "?" is ternary operator: condition ? trueValue : falseValue
        // If b==0 → return a, else call gcd(b, a%b)
    }

    // Method to add two Rational numbers
    public Rational add(Rational r) {
        // Formula: a/b + c/d = (a*d + b*c) / (b*d)
        return new Rational(this.num * r.den + r.num * this.den, this.den * r.den);
    }

    // Method to subtract two Rational numbers
    public Rational subtract(Rational r) {
        // Formula: a/b - c/d = (a*d - b*c) / (b*d)
        return new Rational(this.num * r.den - r.num * this.den, this.den * r.den);
    }

    // Method to multiply two Rational numbers
    public Rational multiply(Rational r) {
        // Formula: a/b * c/d = (a*c)/(b*d)
        return new Rational(this.num * r.num, this.den * r.den);
    }

    // Method to divide two Rational numbers
    public Rational divide(Rational r) {
        // Formula: (a/b) ÷ (c/d) = (a*d)/(b*c)
        return new Rational(this.num * r.den, this.den * r.num);
    }

    @Override
    public String toString() {
        // Converts the Rational object into a String for printing
        return num + "/" + den; 
    }
}

