package Week_07.Nth_Dimesional;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import Week_07.Nth_Dimesional.Interface.Vector_Interface;

// N-dimensional vector implementation
public class Vector implements Vector_Interface, Iterable<Double>, Cloneable {

    private List<Double> coordinates;  // Store coordinates dynamically

    // Constructor with variable arguments
    public Vector(double... values) {
        coordinates = new ArrayList<>();
        for (double v : values) {
            coordinates.add(v);
        }
    }

    // Private constructor for internal use (clone/add)
    private Vector() {
        coordinates = new ArrayList<>();
    }

    @Override
    public double get(int i) {
        return coordinates.get(i);  // Return value at index i
    }

    @Override
    public void set(int i, double val) {
        coordinates.set(i, val);    // Set value at index i
    }

    @Override
    public int length() {
        return coordinates.size();   // Return number of dimensions
    }

    @Override
    public Vector add(Vector_Interface other) {
        if (!(other instanceof Vector)) {
            throw new IllegalArgumentException("Incompatible vector type");
        }
        Vector o = (Vector) other;

        if (this.length() != o.length()) {
            throw new IllegalArgumentException("Dimension mismatch");
        }

        Vector result = new Vector();
        for (int i = 0; i < this.length(); i++) {
            result.coordinates.add(this.get(i) + o.get(i)); // Sum coordinates
        }
        return result;
    }

    @Override
    public Vector clone() {
        Vector copy = new Vector();
        for (double v : this.coordinates) {
            copy.coordinates.add(v);   // Copy each value
        }
        return copy;
    }

    @Override
    public String toString() {
        return coordinates.toString();  // Return string representation
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vector)) return false;
        Vector other = (Vector) o;
        return Objects.equals(this.coordinates, other.coordinates); // Compare values
    }

    @Override
    public Iterator<Double> iterator() {
        return coordinates.iterator(); // Enable for-each loop
    }
}
