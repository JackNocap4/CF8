package gr.aueb.cf.ch3;

import java.util.Scanner;

/** Εμφανίζει εξακολουθητικά ένα μενού
 * επιλογών μέχρι ο χρήστης να δώσει 'έξοδο'.
 */
public class MenuApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        final int EXIT = 3;

        do {
            System.out.println("Παρακαλώ επιλέξτε ένα από τα παρακάτω:");
            System.out.println("1. Εισαγωγή Προιόντος");
            System.out.println("2. Διαγραφή Προιόντος");
            System.out.println("3. Έξοδος");
            choice = scanner.nextInt();
        } while (choice != EXIT);

        System.out.println("Ευχαριστούμε που χρησιμοποιήσατε την εφαρμογή μας!");

    }
}
