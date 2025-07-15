package gr.aueb.cf.ch5;

import java.util.Scanner;

public class Askisi2CelsiusToFahrenheit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Δώσε μία θερμοκρασία");
        double celsius = scanner.nextInt();

        double fahrenheit = celsiusToFahrenheit(celsius);

        System.out.printf("Η θερμοκρασία σε Φαρενάιτ είναι %.2fF\n", fahrenheit);

    }
    /**
     * Μετατρέπει τιμή από βαθμούς Κελσίου σε Φαρενάιτ.
     *
     * @param celsius
     * @return
     */
    public static double celsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }
}
