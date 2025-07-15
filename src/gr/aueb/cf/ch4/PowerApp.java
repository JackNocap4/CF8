package gr.aueb.cf.ch4;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Υπολογίζει το base εις την power
 * με επαναληπτική for. Διαβάζει τα base, power
 * από τον χρήστη και εκτυπώνει το αποτέλεσμα.
 */

public class PowerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger bigResult = new BigInteger("1"); // ξεκινάει με κεφαλαίο είναι Class.
        int base = 0;
        int power = 0;
        int result = 1;


        System.out.println("Παρακαλώ είσάγετε ένα base και έναν power");
        base = scanner.nextInt();
        power = scanner.nextInt();

        for (int i= 1; i <= power ; i++ ) {
            result = result * base;
            bigResult = bigResult.multiply(BigInteger.valueOf(base));
        }

        System.out.printf("%d ^ %d = %d\n", base,power,result);
        System.out.println("Big Result: " + bigResult);

    }
}
