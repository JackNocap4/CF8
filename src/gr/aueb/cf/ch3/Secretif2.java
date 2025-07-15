package gr.aueb.cf.ch3;

import java.util.Scanner;

/** Ελέγχει όλες τις περιπτώσεις.
 *
 */
public class Secretif2 {




        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            final int SECRET = 10;
            int inputNum;

            System.out.println("Παρακαλώ εισάγετε τον μυστικό αριθμό");
            inputNum = scanner.nextInt();

            if (inputNum == SECRET) {
                System.out.println("Bingo!");
            } else {
                System.out.println("Failure. Try again!");
            }
        }
    }