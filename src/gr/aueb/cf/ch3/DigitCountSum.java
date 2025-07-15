package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * ο χρήστης δίνει έναν ακέραιο. Το πρόγραμμα
 * υπολογίζει το πλήθος των ψηφίων του ακεραίου
 * και το άθροισμα των ψηφίων. Για παράδειγμα: αν ο χρήστης
 * εισάγει τον ακέραιο 12345, τότε το πλήθος των ψηφίων είναι 5
 * και το άθροισμα είναι 1 + 2 + 3 + 4 + 5.
 */
public class DigitCountSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum;
        int digitsCount = 0;
        int digitsSum = 0;
        int rightdigit;
        int num;

        System.out.println("Παρακαλώ εισάγετε έναν ακέραιο");
        inputNum = scanner.nextInt();
        num = inputNum;


      do {
          rightdigit = num % 10;
          digitsCount++;
          digitsSum += rightdigit;
          num = num / 10; // ή tempNum /= 10
      } while (num != 0);
        System.out.println("Δώσατε τον ακέραιο: " + inputNum);
        System.out.printf("Πλήθος ψηφίων: %d, Άθροισμα ψηφίων: %d", digitsCount,digitsSum);



    }
}
