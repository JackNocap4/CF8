package gr.aueb.cf.ch6;

/** Ελέγχει με τη χρήση 2 αλγορίθμων είναι
 * συμμετρικός ή όχι.
 */
public class ArraySymetric {

    public static void main(String[] args) {

        int[] arr = {99, 55, 77, 55, 99};

        System.out.println("ο πίνακας είναι συμμετρικός ?" + isArraySymetric(arr));
    }

    public static boolean isArraySymetric(int[] arr) {
        boolean isSymetric = true;

        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            if (arr[i] != arr[j]) {
                // return false;  // early exit
                isSymetric = false;
                break;
            }
        }

        return isSymetric;
        // return true
    }

    public static boolean isSymmetric(int[] arr) {

        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - i - 1]) { // π.χ. αν είναι 0 n - i -1 = n - 1 δλδ το τελευταίο.
                return false;
            }
        }
        return true;
    }
}


