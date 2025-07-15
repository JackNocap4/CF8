package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγγει ένα βαθμό απο 1-10.
 * και το πρόγραμμα εμφανίζει κατάλληλο μήνυμα
 * όπως Άριστα αν πάρει 9 ή 10, Πολύ Καλά αν πάρει 7 ή 8, Καλώς αν πάρει 5 ή 6
 * και Αποτυχία αν είναι από 1 έως 4.
 * Χρησιμοποιεί modern switch
 */

public class GradeWithModernSwitch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int grade;

        System.out.println("Παρακαλώ εισάγετε το βαθμό");
        grade = scanner.nextInt();

        switch (grade) {
            case 1, 2, 3, 4 -> System.out.println("Αποτυχία");
            case 5, 6 -> System.out.println("Καλώς");
            case 7, 8 -> System.out.println("Πολύ Καλά");
            case 9, 10 -> System.out.println("Άριστα");
            default -> System.out.println("Λάθος βαθμός");
        }
    }
}
