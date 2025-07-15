package gr.aueb.cf.ch5;

/**
 * Συγκρίνει 2 double που κανονικά θα έπρεπε να είναι ίσοι,
 * αλλά λόγω του σφάλματος αναπαράστασης εμφανίζονται ως άνισοι.
 */

public class DoubleInequality {

    public static void main(String[] args) {
        double actual = 0.0;
        double expected = 1.0;

        for (int i = 1; i <= 10; i++) {
            actual += 0.1; // το 0.1 δε μπορεί να αναπαρασταθεί ακριβώς και αν
                          // το αθροίζουμε κιολας μεγαλωνει το σφάλμα(κεφαλοποιείται)
        }


        if (actual == expected) System.out.println("Equal");
        else System.out.println("Not equal");

        System.out.printf("actual: %.20f, expected: %.20f", actual,expected);// .20f σημαίνει με 20 δεκαδικά ψηφία
                                                                             // για να δω τις πραγματικές τιμές

    }
}
