package gr.aueb.cf.ch5;

/**
 * Υπολογίζει το α ^ n αναδρομικά.
 */

public class PowerRecursive {

    public static void main(String[] args) {
        int a = 2, n =3;
            System.out.println(power(a, n));
        }



    public static int power(int a, int n){
     //   return (n <= 1) ? 1 : n * facto(n - 1); τριαδικό
        if ( n == 0) return 1;
        return  a * power(a, n-1); // return (n == 0) ? 1 : a * power(a, n-1)

    }
}
