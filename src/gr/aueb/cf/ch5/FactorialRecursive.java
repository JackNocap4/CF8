package gr.aueb.cf.ch5;

/**
 * Calculates n! recursively.
 */
public class FactorialRecursive {

    public static void main(String[] args) {
        int n = 2;
            System.out.println(facto(n));
        }


    public static int facto(int n) {
        if (n <= 1) return 1;
        return n * facto(n - 1); // Recursion
        // return (n <= 1) ? 1 : n * facto(n - 1); τριαδικό
    }
}


