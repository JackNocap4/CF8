package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Θ εκφράσουμε τη λογική του if-then-else
 * με Linear τρόπο ελέγχοντας στην αρχή του
 * κώδικα τα failure/error condition.
 */

public class SecretFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int SECRET_KEY = 12;
        int num;

        System.out.println("Παρακαλώ εισάγετε έναν ακέραιο");
        num = scanner.nextInt();

        if (num != SECRET_KEY) {
            System.out.println("Secret not found");
            System.exit(1); // εφόσον υπάρχει το exit υπονοείται το else:..το διακόπτω γιατί έβαλε λάθος.
        }                         // ό,τι διάφορο του 0 δίνει false.

        System.out.println("Secret was valid. You may go on!");
    }
}
