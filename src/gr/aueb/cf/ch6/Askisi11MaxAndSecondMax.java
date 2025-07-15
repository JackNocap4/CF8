package gr.aueb.cf.ch6;

public class Askisi11MaxAndSecondMax {

    public static void main(String[] args) {


    }

    /**
     * Επιστρέφει τη θέση του μέγιστου στοιχείου σε έναν υποπίνακα
     *
     * @param arr  Ο πίνακας προς αναζήτηση
     * @param low  Η αρχή του υποπίνακα (συμπεριλαμβανομένου)
     * @param high Το τέλος του υποπίνακα (συμπεριλαμβανομένου)
     * @return Η θέση του μέγιστου στοιχείου
     */

    public static int getMaxPosition(int[] arr, int low, int high) {
        if (arr == null || low < 0 || high >= arr.length || low > high) return -1;

        int maxPosition = low;
        for (int i = low + 1; i <= high; i++) {
            if (arr[i] > arr[maxPosition]) {
                maxPosition = i;
            }
        }
        return maxPosition;
    }
}

    /**
     * Επιστρέφει το 2ο μικρότερο στοιχείο του πίνακα
     * @param arr Ο πίνακας προς αναζήτηση
     * @return Το 2ο μικρότερο στοιχείο
     */

