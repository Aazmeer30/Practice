package Week_07.three_dimensional;

public class Main {
    public static void main(String[] args) {
        Vector3d v1 = new Vector3d(1.0, 2.0, 3.0);
        Vector3d v2 = new Vector3d(4.0, 5.0, 6.0);

        System.out.println("v1: " + v1);
        System.out.println("v2: " + v2);

        Vector3d sum = v1.add(v2);
        System.out.println("v1 + v2: " + sum);

        Vector3d copy = v1.clone();
        System.out.println("Clone of v1: " + copy);

        System.out.println("v1 equals copy? " + v1.equals(copy));
    }
}
