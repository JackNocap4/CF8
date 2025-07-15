package gr.aueb.cf.ch5;

import java.util.Scanner;

public class Askisi3Square {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.println("Παρακαλώ δώστε έναν αριθμό");
        n = scanner.nextInt();

        int squared = square(n);

        System.out.printf("To Τετράγωνο του %d είναι %d", n,squared);

       // System.out.println("Το τετράγωνο του αριθμού " + n + " είναι: " + squared);


    }
    /**
     * Υπολογίζει το τετράγωνο του αριθμού που δίνεται.
     *
     * @param n    ο ακέραιος αριθμός
     * @return     το τετράγωνο του αριθμού
     */
    public static int square(int n) {
        return n * n;
    }


}
