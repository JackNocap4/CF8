package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * ο χρήστης δίνει έναν ακέραιο
 * από 1 - 10 και υπολογίζεται ως
 * output o πολλαπλασιασμός του ακεραίου με
 * όλους τους ακέραιους από 1 - 10.
 * Για παράδειγμα αν ο χρήστης δώσει 5
 * τότε ως output αναμένουμε να πάρουυμε
 * 5 * 1 = 5...
 * 5 * 10 = 5

 */
public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 0;
        int i = 1;


        System.out.println("Εισάγετε έναν αριθμό από το 1 έως το 10");
        num = scanner.nextInt();

        while (i <= 10) {
            System.out.printf("%d * %d = %d\n ", num , i, num * i);
            i++;
        }













    }
}
