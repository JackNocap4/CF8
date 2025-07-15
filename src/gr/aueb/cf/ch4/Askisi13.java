package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Εκτυπώνει πίνακα αστεριών διαστάσεων n x n.
 */
public class Askisi13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.print("Δώσε το πλήθος των αστεριών ανά γραμμή και στήλη: ");
        n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
