package gr.aueb.cf.ch3;

import java.util.Scanner;

/** Υλοποιεί ένα μενού με επιλογές
 * και να ελέγχει την επιλογή με if-then-else
 */
public class Askisi2Swstoteri {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (true) {
            System.out.println("Παρακαλώ επιλέξτε ένα από τα παρακάτω");
            System.out.println("1.Εισαγωγή");
            System.out.println("2. Διαγραφή");
            System.out.println("3. Ενημέρωση");
            System.out.println("4. Αναζήτηση");
            System.out.println("5. Έξοδος");

            choice = scanner.nextInt();

            if (choice < 1 || choice > 5) {
                System.out.println("Λάθος επιλογή");
                continue;
            }

            if (choice == 5 ) {
                System.out.println("Ευχαριστούμε");
                break;
            }

            if (choice == 1) {
                System.out.println("Η εισαγωγή έγινε επιτυχώς");
            } else if (choice == 2) {
                System.out.println("Η διαγραφή έγινε επιτυχώς");
            }else if (choice == 3) {
                System.out.println("Η ενημέρωση έγινε επιτυχώς");
            }else {
                System.out.println("Η αναζήτησε έγινε επιτυχώς");
            }
        }
    }
}
