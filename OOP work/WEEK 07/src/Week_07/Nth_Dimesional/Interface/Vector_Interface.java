package Week_07.Nth_Dimesional.Interface;

// Interface for N-dimensional vectors (only vector-specific methods)
public interface Vector_Interface {
    double get(int i);                    // Get value at index i
    void set(int i, double val);          // Set value at index i
    int length();                         // Return number of dimensions
    Vector_Interface add(Vector_Interface other); // Add another vector
}
