package Week_07.three_dimensional;

import Week_07.three_dimensional.Interface.Vector_Interface_3D;

public class Vector3d implements Vector_Interface_3D, Cloneable {
    private double x, y, z;

    // Constructor
    public Vector3d(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Getters
    @Override
    public double getX() { return x; }
    @Override
    public double getY() { return y; }
    @Override
    public double getZ() { return z; }

    // Setters
    @Override
    public void setX(double x) { this.x = x; }
    @Override
    public void setY(double y) { this.y = y; }
    @Override
    public void setZ(double z) { this.z = z; }

    // Add another 3D vector
    @Override
    public Vector3d add(Vector_Interface_3D other) {
        if (!(other instanceof Vector3d)) {
            throw new IllegalArgumentException("Incompatible type");
        }
        Vector3d o = (Vector3d) other;
        return new Vector3d(this.x + o.x, this.y + o.y, this.z + o.z);
    }

    // Clone method
    @Override
    public Vector3d clone() {
        return new Vector3d(this.x, this.y, this.z);
    }

    // toString
    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }

    // equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vector3d)) return false;
        Vector3d other = (Vector3d) o;
        return Double.compare(x, other.x) == 0 &&
               Double.compare(y, other.y) == 0 &&
               Double.compare(z, other.z) == 0;
    }
}
