package gr.aueb.cf.ch6;

/**
 * Αναζητά ένα στοιχείο σε έναν πίνακα
 * και επιστρέφει τη θέση του στοιχείου στον
 * πίνακα ή -1 αν δεν υπάρχει. (Οι έγκυρες τιμές είναι από 0 και πάνω)
 */
public class ArraySearch {

    public static void main(String[] args) {
        int position;
        int value = 5;
        int[] arr = {1, 2, 3};

        position = getPosition(arr,value);

        if (position == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("Found. Position = " + (position + 1) + ", value = " + arr[position]); // το +1 το βάζω για να είναι πιο φιλικό. και να δώσει 1 αντί για 0 στην 1η θέση.
        }

    }

    /**
     * Επιστρέφει τη θέση του 1ου στοιχείου στοιχείο του πίνακα που ισούται
     * με το value. Αν δεν υπάρχει το στοιχείο επιστρέφει -1.
     * @param arr      ο input πίνακας
     * @param value    η τιμή αναζήτησης
     * @return         το position του πίνακα που βρέθηκε το στοιχείο.
     *                 -1 otherwise.
     */

    public static int getPosition(int[] arr, int value) {
        int positionToReturn = -1; // το -1 είναι το λάθος.

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                positionToReturn = i;
                break;
            }
        }
        return positionToReturn;
    }
}
