package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * O χρήστης δίνει ένα διψήφιο ακέραιο και το πρόγραμμα
 * υπολογίζει το άθροισμα των ψηφίων του ακεραίου.
 * Για παράδειγμα αν ο χρήστης δώσει το 32, τότε
 * το άθροισμα των ψηφίων είναι 3 + 2 = 5
 */
public class DigitsCount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int leftDigit = 0;
        int rightDigit = 0;
        int SumofDigits = 0;
        int inputNum = 0;


        System.out.println("Παρακαλώ εισάγετε έναν διψήφιο ακέραιο");
        inputNum = scanner.nextInt();

        leftDigit = inputNum / 10;
        rightDigit = inputNum % 10;
        SumofDigits = leftDigit + rightDigit;


        System.out.printf("%d  =  %d + %d = %d", inputNum, leftDigit, rightDigit, SumofDigits);



    }
}
