package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγγει ένα βαθμό απο 1-10.
 * και το πρόγραμμα εμφανίζει κατάλληλο μήνυμα
 * όπως Άριστα αν πάρει 9 ή 10, Πολύ Καλά αν πάρει 7 ή 8, Καλώς αν πάρει 5 ή 6
 * και Αποτυχία αν είναι από 1 έως 4.
 */
public class GradesApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int grade;

        System.out.println("Παρακαλώ εισάγετε το βαθμό");
        grade = scanner.nextInt();

        switch (grade) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Αποτυχία"); // λογική του ή. ή το 1 ή το 2...
                break;
            case 5:
            case 6:
                System.out.println("Καλώς");
                break;
            case 7:
            case 8:
                System.out.println("Πολύ Καλά");
                break;
            case 9:
            case 10:
                System.out.println("Άριστα");
                break;
            default:
                System.out.println("Παρακαλώ δώστε αριθμό 1 - 10");
        }

    }
}
