package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Εκτυπώνει αστεράκια από n έως 1 αντίστροφα.
 */
public class Askisi15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.println("Δώσε το πλήθος των γραμμών: ");
        n = scanner.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
