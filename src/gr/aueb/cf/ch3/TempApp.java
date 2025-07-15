package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Λαμβάνει μία θερμοκρασία από τον χρήστη
 * και εμφανίζει κατάλληλο μύνημα αν η
 * θερμοκρασία είναι κάτω από το 0.
 */
public class TempApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temp = 0;
        boolean isTempBelowZero = false;

        System.out.println("Παρακαλώ εισάγετε μία θερμοκρασία");
        temp = scanner.nextInt();

        isTempBelowZero = temp < 0; //π.χ. αν δώσω -20 είναι θα είναι true

        System.out.println("H θερμοκρασία είναι κάτω από το 0: " + isTempBelowZero);



    }
}
