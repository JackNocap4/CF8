package gr.aueb.cf.ch16.skeletal;

public class Main {
    public static void main(String[] args) {
        IRectangle square = new Square();

        // Θα επιστρέψει 0.0 γιατί δεν έχει οριστεί width/height πουθενά
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());
        System.out.println("Is square? " + square.isSquare());
    }
}
