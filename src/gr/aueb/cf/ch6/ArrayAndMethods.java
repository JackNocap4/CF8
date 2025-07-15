package gr.aueb.cf.ch6;

/**
 * Demo with arrays and methods.
 * Πως περνάμε πίνακες ως παραμέτρους μεθόδους.
 */
public class ArrayAndMethods {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 8};
        printArray(arr, 0, arr.length);

    }
    public static void printArray(int[] arr) {
        arr[0] = 1000;
        //arr = new int[100];
        for (int el : arr) {
            System.out.println(el + " "); // ¨οταν έχω μεγάλες δομές η Java περνάει τον δείκτη.
        }
    }
    /**
     * Overloaded version of for with boundaries.
     * Print an array slice from 'low' to 'high',
     * that is from low till high - 1.
     *
     * @param arr
     * @param low
     * @param high
     */
    public static void printArray(int[] arr, int low, int high) {
        if (low < 0 || high > arr.length) {  // το high είναι exclusive όπως στην Python
            return;
        }

        for ( int i = low; i < high; i++) {
                System.out.println(arr[i] + " ");
            }
    }
}

