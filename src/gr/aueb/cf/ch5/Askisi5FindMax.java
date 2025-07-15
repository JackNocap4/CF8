package gr.aueb.cf.ch5;

import java.util.Scanner;

public class Askisi5FindMax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Παρακαλώ δώστε 3 αριθμούς");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int maxnum = findMax(num1, num2, num3);

        System.out.println("O μεγαλύτερος αριθμός από τους 3 είναι " + maxnum);

    }
    /**
     * Επιστρέφει τον μεγαλύτερο από τρεις ακέραιους αριθμούς.
     *
     * @param a πρώτος αριθμός
     * @param b δεύτερος αριθμός
     * @param c τρίτος αριθμός
     * @return ο μεγαλύτερος από τους τρεις
     */
    public static int findMax(int a, int b, int c) {
       return Math.max(a, Math.max(b, c));   // Αν είχαμε τέσσερις αριθμούς: Math.max(Math.max(a, b), Math.max(c, d))
    }


}
