package gr.aueb.cf.ch13.askisi;

public class MathHelper {

    public static int max(int[] numbers) {
        if (numbers == null || numbers.length == 00) {
            throw new IllegalArgumentException("To array είναι κενό");
        }
        int max = numbers[0];
        for (int n : numbers){
            if (n > max) {
                max = n;
            }
        }
        return max;
    }

    public static int min(int[] numbers) {
        if (numbers == null || numbers.length == 00) {
            throw new IllegalArgumentException("To array είναι κενό");
        }
        int min = numbers[0];
        for (int n : numbers){
            if (n < min) {
                min = n;
            }
        }
        return min;
    }

    public static double average(int[] numbers) {
        int sum = 0;
        for (int n : numbers) {
            sum += n;
        }
        return (double) sum / numbers.length;
    }
}
