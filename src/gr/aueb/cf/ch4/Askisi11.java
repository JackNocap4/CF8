package gr.aueb.cf.ch4;

/**
 * Εκτυπώνει n οριζόντια αστεράκια στην ίδια γραμμή.
 */
import java.util.Scanner;

public class Askisi11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.print("Δώσε το πλήθος των αστεριών: ");
         n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
