package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Υπολογίζει τη δύναμη α ^ n.
 */
public class PowerApp {

    public static void main(String[] args) {
       for (int i = 1; i <= 10; i++) {
           System.out.printf("2^%d = %,5d\n", i, power(2, i));
       }
    }
    /**
     * Delegation. That is we call another method.
     * to achieve our goal.
     * @param a
     * @param n
     * @return
     */
    public static long power(int a, int n) {
       /* int result = 1;
         for (int i = 1; i <= n; i++) {
            result *=a;
       }
        return result;*/
        return (long) Math.pow(a, n); // βάζω long επειδή η math δε δίνει long

    }
}
