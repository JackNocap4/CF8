package gr.aueb.cf.ch14;

public class MathHelper {

    /**
     * Returns max
     * @param arr
     * @return max
     */
    public static int getMax(int[] arr) {
        if (arr == null || arr.length == 0) throw new IllegalArgumentException("Array is empty or null");

        int max = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
        }
        return max;
    }

    /**
     * Returns min
     * @param arr
     * @return min
     */
    public static int getMin(int[] arr) {
        if (arr == null || arr.length == 0) throw new IllegalArgumentException("Array is empty or null");

        int min = arr[0];
        for (int num : arr) {
            if (num < min) min = num;
        }
        return min;
    }

    /**
     * Returns Returns average
     * @param arr
     * @return min
     */

    public static double getAverage(int[] arr) {
        if (arr == null || arr.length == 0) throw new IllegalArgumentException("Array is empty or null");

        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length;
    }
}
