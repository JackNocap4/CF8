package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Βρίσκει το απόλυτο ενός ακεραίου με τη
 * χρήση τριαδικού τελεστή. Το απόλυτο ενός
 * ακεραίου είναι θετικός ακέραιος.
 * Για παράδειγμα: το απόλυτου του -5 = 5.
 * το απόλυτου του 5 = 5.
 */

public class AbsTernary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1;
        int abs;

        System.out.println("Παρακαλώ εισάγετε έναν ακέραιο");
        num1 = scanner.nextInt();

        abs = (num1>=0) ? num1 : -num1; // επειδή αν num1 = -5 τότε το -num1 = -(-5)=5!

        System.out.printf("Η απόλυτη τιμή του %d είναι το %d", num1, abs);

    }
}
