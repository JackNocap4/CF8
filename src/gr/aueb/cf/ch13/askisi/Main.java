package gr.aueb.cf.ch13.askisi;

public class Main {
    public static void main(String[] args) {
        PointXYZ point = new PointXYZ(3.0, 4.0, 12.0);

        // Εκτύπωση του σημείου
        System.out.println("Point: " + point);

        // Κλήση και εκτύπωση των μεθόδων απόστασης
        System.out.println("XY Distance: " + point.getXYDistance());
        System.out.println("YZ Distance: " + point.getYZDistance());
        System.out.println("XZ Distance: " + point.getXZDistance());
        System.out.println("XYZ Distance: " + point.getXYZDistance());
    }
}
