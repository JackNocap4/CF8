package gr.aueb.cf.ch4;

/**
 * Υπολογίζει το άθροισμα και το γινόμενο
 * των 10 πρώτων ακεραίων.
 */
public class SumMulApp {

    public static void main(String[] args) {
        int sum = 0;
        int mul = 1;

        for (int i = 1; i<=10; i++) {
            sum += i;
            mul *= i;
        }
        System.out.println("sum is : " + sum);
        System.out.println("mul is : " + mul);

    }
}
