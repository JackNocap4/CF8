package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * ο χρήστης θα δώσει αριθμητή
 * και παρονομαστή και το πρόγραμμα
 * θα πρέπει να ελέγχξει
 * αν ο παρονομαστής είναι 0,
 * γιατί δεν μπορεί να γίνει διαίρεση
 */

public class DivisionApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;

        while (true) {
            System.out.println(" Παρακαλώ δώστε τον αριθμητή");
            numerator = scanner.nextInt();

            System.out.println("Παρακαλώ δώστε τον παρονομαστή");
            denominator = scanner.nextInt();

            if (denominator == 0) {
                System.out.println("Ο παρονομαστής δεν πρέπει να είναι 0.");
                continue; //break. Η break διακόπτει, ενώ η continue κόβει αλλα ξαναεκτελεί τη while.
            }

            result = numerator / denominator;
            System.out.printf(" %d / %d = %d", numerator, denominator, result);
        }
    }
}
