package gr.aueb.cf.ch2;

/**
 * Προσομειώνει ένα τυχαίο ζάρι(die). Δηλαδή
 * παράγει ένα τυχαίο ακέραιο μεταξύ 1 και 6.
 */
public class RandomApp {

    public static void main(String[] args) {
        int die = 0; // die είναι το ζάρι.

        // (max - min + 1) + min
        die = (int) (Math.random() * 6) + 1; //

        /** μετατρέπεται μόνο η Μath.random * 6 όχι το 1 (1=min)
         * επειδή η random δίνει μετακύ 0.0 και 0.99
         * εδώ θα μας δώσει μεταξύ 0.0 και 5.99(τo 5.99 είναι δεκαδικό γι αυτό το κάνω ακέραιο με το (int)
         * οπότε βάζω + 1 έξω απο την παρένθσεη
         * για να πάρω απο 1 έως 6.
         */

        System.out.println(die);

    }
}


