package gr.aueb.cf.ch3;

import java.sql.SQLOutput;

/** υπολογίζει το άθροισμα των
 * 10 πρώτων, από το 1 έως το 10. kai τον πολ/μο τους
 */
public class SumMul10 {

    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        int mul = 1;// επειδή το ουδέτερο στοιχείο του πολ/μου είναι το 1.
        int j = 1;

        while (i<= 10) {
            sum += i; // sum = sum + 1
            i++;
        }

        while (j<=10) {
            mul *= j; // mul = mul * j
            j++;
        }

        System.out.printf("'Αθροισμα= %d, Γινόμενο= %,d", sum,mul);
    }

}
