package gr.aueb.cf.ch5;

import java.util.Scanner;

public class Askisi4IsPrime {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Δώσε έναν ακέραιο αριθμό: ");
        int a = scanner.nextInt();


        if (isPrime(a)) {
            System.out.println("Ο αριθμός " + a + " είναι πρώτος.");
        } else {
            System.out.println("Ο αριθμός " + a + " ΔΕΝ είναι πρώτος.");
        }

    }


    public static boolean isPrime(int b) {
        if (b <= 1) return false;

        for (int i = 2; i <= Math.sqrt(b); i++) {
            if (b % i == 0) return false;
        }
        return true;
    }
}
