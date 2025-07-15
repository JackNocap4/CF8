package gr.aueb.cf.ch4;

/**
 * Υπολογίζει και εμφανίζει το άθροισμα των ακεραίων από το 1 έως το 50.
 */
public class Askisi22 {

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 50; i++) {
            sum += i;
        }
        System.out.println("Το άθροισμα είναι: " + sum);
    }
}
