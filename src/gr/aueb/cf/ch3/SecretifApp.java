package gr.aueb.cf.ch3;

import java.util.Scanner;

/** ο χρήστης εισάγει έναν ακέραιο
 * και προσπαθεί να μαντέψει έναν secret number.
 * Αν τον μαντέψει τότε κάνει Bingo!
 */
public class SecretifApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int SECRET = 10;
        int inputNum;

        System.out.println("Παρακαλώ εισάγετε τον μυστικό αριθμό");
        inputNum = scanner.nextInt();

        if (inputNum == SECRET) {
            System.out.println("Bingo!");
        }
    }
}
