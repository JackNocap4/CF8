package gr.aueb.cf.ch3;

import java.util.Scanner;

public class Askisi2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;


        do {
            System.out.print("Επιλέξτε μια επιλογή από 1 έως 5: ");
            System.out.println("1. Εισαγωγή");
            System.out.println("2. Διαγραφή");
            System.out.println("3. Ενημέρωση");
            System.out.println("4. Αναζήτηση");
            System.out.println("5. Έξοδος");
            num = scanner.nextInt();

            if (num == 1) {
                System.out.println("Επιλέξατε Εισαγωγή");
            } else if (num == 2) {
                System.out.println("Επιλέξατε Διαγραφή");
            } else if (num == 3) {
                System.out.println("Επιλέξατε Ενημέρωση");
            } else if (num == 4) {
                System.out.println("Επιλέξατε Αναζήτηση");
            } else if (num == 5) {
                System.out.println("Επιλέξατε Έξοδος");
            } else {
                System.out.println("Μη έγκυρη επιλογή. Παρακαλώ εισάγετε αριθμό μεταξύ 1 και 5.");
            }

        } while (num != 5);

        System.out.println("Σας ευχαριστούμε που χρησιμοποιήσατε την εφαρμογή μας!");

    }
}
