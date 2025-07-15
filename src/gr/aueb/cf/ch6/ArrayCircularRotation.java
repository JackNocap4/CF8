package gr.aueb.cf.ch6;

import java.util.Arrays;

public class ArrayCircularRotation {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};
        int[] leftShifted = shiftLeftBy(arr, 2);
        int[] rightShifted = shiftRightBy(arr, 3);

        // Εκτύπωση των πινάκων
        System.out.println(Arrays.toString(leftShifted));  // Εκτυπώνει τον αριστερά μετατοπισμένο πίνακα
        System.out.println(Arrays.toString(rightShifted)); // Εκτυπώνει τον δεξιά μετατοπισμένο πίνακα


    }
    public static int[] shiftRightBy(int[] arr, int offset) { // offset είναι το μέγεθος μετατόπισης, δλδ 1.
        if (arr == null) return new int[0];
        if (offset < 0) return new int[0];

        int[] rotated = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            rotated[(i + offset) % arr.length] =  arr[i]; // για i = 1: rotated[1 + 1 % 10] = arr[1]. rotated [2] = arr[1].
        }
        return rotated;
    }

    public static int[] shiftLeftBy(int[] arr, int offset) {
        if (arr == null) return new int[0];
        if (offset < 0) return new int[0];

        int[] rotated = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            rotated[i] = arr[(i + offset) % arr.length]; // για i = 1: rotated[1] = arr[1 + 1 % 10 ]. rotated[1] = arr[2].
        }
        return rotated;
    }

}