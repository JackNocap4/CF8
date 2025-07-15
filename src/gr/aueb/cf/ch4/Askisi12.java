package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Εκτυπώνει n κάθετα αστεράκια, ένα σε κάθε γραμμή.
 */
public class Askisi12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.print("Δώσε το πλήθος των αστεριών: ");
        n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("*");
        }
        System.out.println();
    }
}
