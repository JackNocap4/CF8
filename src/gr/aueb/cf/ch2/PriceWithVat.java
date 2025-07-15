package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * ο χρήστης εισάγει μια τιμή και το πρόγραμμα
 * υπολογίζει την τιμή με το ΦΠΑ. Για παράδειγμα, αν ο ΦΠΑ
 * είναι 24% (0.24) και ο χρήστης δώσει την τιμή 100 το
 * αποτέλεσμα θα είναι 124.
 */
public class PriceWithVat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double inputPrice = 0.0;
        double priceWithVat = 0.0;
        double computedVat = 0.0;
        final double VAT_RATE = 0.24; // ΦΠΑ είναι το VAT

        System.out.println("Παρακαλώ εισάγετε την τιμή");
        inputPrice = scanner.nextDouble();
        computedVat = inputPrice * VAT_RATE;
        priceWithVat = inputPrice + computedVat;


        System.out.printf("%.2f price με  %.2f  VAT is %.2f Euros", inputPrice, VAT_RATE,priceWithVat);

    }
}
