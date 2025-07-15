package gr.aueb.cf.ch6;

/**
 * Ανταλάσσει αμοιβαία τα 2 στοιχεία ενός
 * πίνακα.
 */

public class SwapWithArray {

    public static void main(String[] args) {
        int[] arr = {10, 20};
        System.out.println("arr[0]= " + arr[0] + ", arr[1]= " + arr[1]);
        swap(arr);
        System.out.println("arr[0]= " + arr[0] + ", arr[1]= " + arr[1]);

    }

    public static void swap(int[] arr) {
        if (arr.length !=2) return; // θέλουμε πίνακα με 2 στοιχεία. Αν δεν είναι return!

        int tmp = arr[0];
        arr[0] = arr[1];
        arr[1] = tmp;

    }
}
