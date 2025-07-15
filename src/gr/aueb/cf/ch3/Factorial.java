package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει το παραγοντικό του n, όπου
 * n είναι ένας ακέραιος που δίνει ο χρήστης.
 * Το παραγοντικό του n συμβολίζεται ως n! και
 * ισούται με 1 * 2 * 3 * n. Για παράδειγμα το 3!= 1 * 2 * 3,
 * το 0! = 1 κλπ.
 */

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int i = 1;
        int result = 1;

        System.out.println("Παρακαλώ δώστε έναν ακέραιο");
        num = scanner.nextInt();

        while (i <= num) {
            result *= i ;
            i++;
        }
        System.out.printf("Το παραγοντικό του %d έιναι %d",num,result);
    }
}
