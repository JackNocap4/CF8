package gr.aueb.cf.ch5;

/**
 * Συγκρίνουμε double με EPSILON
 */
public class EpsilonApp {

    public static void main(String[] args) {
        final double EPSILON = 0.000005;
        double actual = 0.0;
        double expected = 1.0;

        for (int i = 1; i <= 10; i++) {
            actual += 0.1;
        }


        if (Math.abs(actual - expected) <= EPSILON) System.out.println("Equal");

        else System.out.println("Not equal"); // έτσι βλέπω τη διαφορά και με το abs
                                             // έχω την απόλυτη τιμη γτ μπορεί να είναι αρνητική η διαφορά.
    }
}
