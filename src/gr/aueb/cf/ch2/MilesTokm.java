package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Μετατρέπει μίλια σε χιλιόμετρα,
 * όπου 1 μίλια = 1.6 χιλιόμετρα
 * άρα 10 μίλια = 16 χιλιόμετρα. Ο χρήστης δίνει την τιμή σε μίλια.
 */
public class MilesTokm {
    public static void main(String[] args) {

        // Δήλωση μεταβλητών και αρχικοποίηση
        Scanner scanner = new Scanner(System.in);
        double inputMiles = 0.0;
        double kilometers = 0.0;
        final double KM_PER_MILE = 1.6;

        // Εντολές
        System.out.println("Παρακαλώ εισάγετε έναν αριθμό(ακέραιο)");
        inputMiles = scanner.nextInt();
        kilometers = inputMiles * KM_PER_MILE;

        System.out.println("Miles: " + inputMiles + ", km: " + kilometers);

        System.out.printf("%f miles =  %f  kilometers", inputMiles, kilometers);









    }
}
