package Week_07.three_dimensional.Interface;

public interface Vector_Interface_3D {
    double getX();
    double getY();
    double getZ();

    void setX(double x);
    void setY(double y);
    void setZ(double z);

    Vector_Interface_3D add(Vector_Interface_3D other);
    Vector_Interface_3D clone();

    String toString();
    boolean equals(Object o);
}
