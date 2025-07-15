package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Λαμβάνει από τον χρήστη 2 ακεραίους,
 * έστω base και power και υπολογίζει με
 * επαναληπτικό τρόπο (while-do) τη δύναμη base υψωμένο
 * εις την power και εκτυπώνει το αποτέλεσμα
 * στο στάνταρ output για παράδειγμα αν ο χρήστης
 * δώσει base = 2 και power = 10 τότε το base υψωμένο
 * εις την power είναι 1024, δλδ 2 * 2...* 2 = 1024
 *
 */

public class PowerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base = 0;
        int power = 0;
        int result = 1;// επειδή είναι πολ/μος βάζω 1. απλά γράφω το σχόλιο για να μη σκαλώνω.
        int i = 1; // δείκτης για τη while. Αν i = 0 τότε θα έβαζα i < power στο while.

        System.out.println("Παρακαλώ είσάγετε τον πρώτο ακέραιο");
        base = scanner.nextInt();
        System.out.println("Παρακαλώ είσάγετε τον δέυτερο ακέραιο");
        power = scanner.nextInt();

        while (i <= power) {
            result *= base;
            //result = (int) Math.pow(base,power)--> λάθος.δίνει αποτέλεσμα επειδή κάνω το ίδιο πράμα 10 φορές.
            i ++;



        }
        System.out.printf("%d ^ %d = %d", base,power,result);
    }
}
