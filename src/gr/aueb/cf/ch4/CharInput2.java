package gr.aueb.cf.ch4;

import java.io.IOException;
import java.util.Scanner;

/**
 * Διαβάζει Char με scanner.
 */
public class CharInput2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char inputChar;

        System.out.println("Παρακαλώ δώστε ένα χαρακτήρα");
        inputChar = scanner.nextLine().charAt(0);
        System.out.println("Input char: " + inputChar);
    }
}
