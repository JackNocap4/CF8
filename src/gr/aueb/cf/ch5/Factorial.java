package gr.aueb.cf.ch5;

/**
 * Υπολογίζει το παραγοντικό του n.
 * n! (n παραγοντικό) = 1 * 2 * 3 * ... * n.
 * Για παράδειγμα το 3! = 1 * 2 * 3 = 6
 * το 0! = 1.
 * Δεν ορίζεται 0 παραγοντικό.
 */
public class Factorial {

    public static void main(String[] args) {
        for (int i = 1; i <= 15; i++) {
            System.out.printf("%2d! = %,15d\n", i, facto(i)); // το , είναι διαχωριστικό χιλιάδων.
        }
    }
    /**
     * Calculates n!
     * @param n        the input integer
     * @return         the factorial of n.
     */
    public static int facto(int n) {
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
