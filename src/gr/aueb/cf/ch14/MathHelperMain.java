package gr.aueb.cf.ch14;

public class MathHelperMain {

    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 154, 567,250};


        System.out.println("Το max του πίνακα είναι: " + MathHelper.getMax(arr));
        System.out.println("Το min του πίνακα είναι: " + MathHelper.getMin(arr));
        System.out.println("Το average του πίνακα είναι: " + MathHelper.getAverage(arr));
    }
}
