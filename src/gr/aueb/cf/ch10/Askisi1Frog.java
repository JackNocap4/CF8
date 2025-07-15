package gr.aueb.cf.ch10;

/**
 * Δύο βάτραχοι προσπαθούν να πιάσουν μία αράχνη. Γράψτε μία μέθοδο που παίρνει ως είσοδο τρεις
 * ακεραίους που αντιπροσωπεύουν τη θέση του κάθε βάτραχου καθώς και τη θέση της αράχνης.
 * Η διαφορά μεταξύ τον θέσεων δίνει την απόσταση μεταξύ του κάθε βάτραχου και της αράχνης.
 * Αν ο 1ος βάτραχος πιάσει την αράχνη, τότε εκτυπώστε μήνυμα «Βάτραχος 1», αν ο 2ος βάτραχος πιάσει
 * την αράχνη, τότε εκτυπώστε μήνυμα του «Βάτραχος 2»,αν και οι δύο βάτραχοι φτάσουν την ίδια στιγμή
 * εκτυπώστε «Αράχνη». Για παράδειγμα αν το input είναι 2 3 4 τότε εκτυπώνει «Βάτραχος 2». Αν είναι
 * 5 7 6 τότε εκτυπώνει «Αράχνη».  Σας δίνεται ένας δισδιάστατοςπίνακας όπου η κάθε γραμμή είναι 3
 * αριθμοί όπως παραπάνω και θα πρέπει να εκτυπώσετε μία απάντηση για κάθε περίπτωση.
 */
public class Askisi1Frog {

    public static void main(String[] args) {
        int[][] grid = {
                {1, 2, 3},
                {7, 3, 2},
                {2, 4, 3},
                {4, 2, 1},
                {10, 12, 9},
        };

        // Κλήση της μεθόδου για κάθε γραμμή του πίνακα
        for (int i = 0; i < grid.length; i++) {
            int frog1 = grid[i][0];
            int frog2 = grid[i][1];
            int spider = grid[i][2];

            printWhichfrogEatsSpider(frog1, frog2, spider);
        }
    }

    /**
     *  Prings frog 1 αν η απόσταση του βατράχου 1 από την αράχνη είναι μικρότερη από την απόσταση του βατράχου 2
     *  από την αράχνη, αλλιώς η απόσταση του βατράχου 2 ... αλλίως εκτυπώνει αράχνη αν οι αποστάσεις είναι ίδιες.
     * @param frog1       η θέση του frog 1
     * @param frog2       η θέση του frog 2
     * @param spider      η θέση της spider
     */
    public static void printWhichfrogEatsSpider(int frog1, int frog2, int spider) {
        int distance1;
        int distance2;

        distance1 = Math.abs(frog1 - spider);
        distance2 = Math.abs(frog2 - spider);

        if (distance1 < distance2) {
            System.out.println("frog 1");
        } else if (distance2 < distance1){
            System.out.println("frog 2");
        } else {
            System.out.println("Spider");

        }
    }
}
