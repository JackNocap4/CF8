package gr.aueb.cf.ch13.askisi;

public class MathHelperMain {

    public static void main(String[] args) {

        int[] numbers = {1, 4, 5, 6, 543, 45, 98};


        System.out.println("To μέγιστο είναι: " + MathHelper.max(numbers));
        System.out.println("To ελάχιστο είναι: " + MathHelper.min(numbers));
        System.out.println("Ο μέσος όρος είναι: " + MathHelper.average(numbers));


    }





}