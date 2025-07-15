package gr.aueb.cf.ch10;

/**
 * Έστω ένας πίνακας ακεραίων έστω ages που συμβολίζει ηλικίες (σε έτη), και έστω η ηλικία age (σε έτη) ενός χαρακτήρα.
 * Γράψτε μία μέθοδο που λαμβάνει ως είσοδο τον πίνακα ages και
 * την ηλικία age και επιστρέφει την ηλικιακή διαφορά του χαρακτήρα από τη μέγιστη ηλικία του πίνακα.
 * Αν δεν υπάρχει ηλικιακή διαφορά επιστρέφει 0.
 */
public class Askisi5Ages {

    public static void main(String[] args) {
            int[] ages = {18, 25, 32, 32, 29, 32, 40};
            int myAge = 35;

            int diff = ageDiff(ages, myAge);
            System.out.println(diff);
        }

        public static int ageDiff(int[] ages, int characterages) {
            if (ages == null || ages.length == 0) return 0;

            int maxAge = ages[0];
            for (int i = 1; i < ages.length; i++) {
                if (ages[i] > maxAge) {
                    maxAge = ages[i];
                }
            }

            int diff = maxAge - characterages;
            //        return (diff > 0) ? diff : 0;
            if (diff > 0) {
                return diff;
            } else {
                return 0;
            }
        }
    }


