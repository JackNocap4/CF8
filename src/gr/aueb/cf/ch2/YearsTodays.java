package gr.aueb.cf.ch2;

import java.util.Scanner;

/** ο χρήστης δίνει την ηλικία του
 * σε έτη (έστω ακέραιος) και το
 * πρόγραμμα επιστρέφει την ηλικία
 * σε ήμερες όπου θεωρούμε ότι ένα έτος
 * είναι 365 ημέρες.
 */
public class YearsTodays {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int ageinYears = 0;
        final int DAYS_PER_YEAR =365;
        int ageIndays = 0;

        System.out.println("Παρακαλώ εισάγετε την ηλικία σας");
        ageinYears = scanner.nextInt();
        ageIndays = ageinYears * DAYS_PER_YEAR;

        System.out.printf("Ta %d έτη της ηλικίας σας αντιστοιχούν σε %d μέρες",ageinYears, ageIndays);



    }
}
