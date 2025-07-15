package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Εκτυπώνει αστεράκια από 1 έως n.
 */
public class Askisi14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.print("Δώσε το πλήθος των γραμμών: ");
        n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
