package gr.aueb.cf.ch2;

import java.util.Scanner;

/*
* Διαβάζει από το χρήστη ένα ποσό σε ευρώ
* και το μετατρέπει σε USD και cents.
* η ισοτιμία είναι 99 cents USD = 1 ευρώ
* Εκτυπώνει το αποτέλεσμα
 */
public class EuroUsdConverter {
    // δήλωση και αρχικοποίηση μεταβλητών
    public static void main(String[] args) {
        int inputEuros = 0;
        int totalUsdcents = 0;
        int usaDollars = 0;
        int usaCents = 0;
        final int parity = 99;
        final int USA_CENTS_PER_EURO = 100;
        Scanner in = new Scanner(System.in);

        // Εντολές
        System.out.println("Παρακαλώ εισάγετε ένα ποσό σε ευρώ(ακέραιο)");
        inputEuros = in.nextInt();

        totalUsdcents = inputEuros * parity; //magic number // τα βάζω πάνω σαν σταθερές
        usaDollars = totalUsdcents / 100; // δίνει μόνο το ακέραιο μέρος οπότε στα 1.98 cents δίνει το 1
        usaCents = totalUsdcents % 100;//mod

        System.out.printf("%d \u20AC =  %d.%d $ usa cents", inputEuros, usaDollars, usaCents);




    }

}
