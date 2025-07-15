package gr.aueb.cf.ch8;

import java.time.LocalDateTime;

/**
 * Η {@link SimpleBank} παρέχει μία μόνο υπηρεσία,
 * την υπηρεσία κατάθεσης (deposit).
 */
public class SimpleBank {
    static double balance = 0;  // είναι έξω από τη main.

    public static void main(String[] args)  {
        try {
            deposit(5);
        } catch (Exception e) {
            System.out.println(e.getMessage()); // είναι το message κάτω. με το e.getMessage
        }
        System.out.println(balance);
    }

    /**
     * Deposits a certain amount of money.
     *
     * @param amount    the amount of money.
     */
    public static void deposit(double amount) throws Exception {  // πρέπει να βάλω τα checked exceptions και εδώ.
        try {
            if (amount < 0) throw new Exception("Το ποσό κατάθεσης πρέπει να είναι μη-αρνητικό");
            balance += amount;
            // logging
        } catch (Exception e) {
            System.err.println(LocalDateTime.now() + "\n" + e); // logging
            throw e; // ενημερώνεται ο caller.
        }
    }
}