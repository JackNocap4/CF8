package gr.aueb.cf.ch6;

/**
 * Δήλωση και αρχικοποίηση ενός απολύ πίνακα.
 */
public class ArrayInit1 {

    public static void main(String[] args) {

        // Δήλωση και δέμσευση χώρου
        int[] arr = new int[5];

        // populate the array
        arr[0] = 1;
        arr[1] = 8;
        arr[2] = 5;
        arr[3] = 9;
        arr[4] = 7;

        System.out.println("First element: " + arr[0]);
        System.out.println("Array length: " + arr.length);
        System.out.println("Last element: " + arr[arr.length-1]);

    }
}
