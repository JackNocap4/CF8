package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Επιστρέφει την ημέρα της εβδομάδας με βάση έναν αριθμό 1-7.
 */
public class Askisi31 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dayNum;
        String day;

        System.out.print("Δώσε έναν ακέραιο από 1 έως 7: ");
        dayNum = scanner.nextInt();

        day = switch (dayNum) {
            case 1 -> "Δευτέρα";
            case 2 -> "Τρίτη";
            case 3 -> "Τετάρτη";
            case 4 -> "Πέμπτη";
            case 5 -> "Παρασκευή";
            case 6 -> "Σάββατο";
            case 7 -> "Κυριακή";
            default -> "Άκυρη επιλογή! Δώσε αριθμό από 1 έως 7.";
        };
    }
}

