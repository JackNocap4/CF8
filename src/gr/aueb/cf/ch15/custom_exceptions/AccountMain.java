package gr.aueb.cf.ch15.custom_exceptions;

public class AccountMain {

    public static void main(String[] args) {
        Account aliceAccount = new Account(1, "GR4444444", "Alice", "W.", "F685746854456123", 100);

        try {
            aliceAccount.deposit(50);
            System.out.println(aliceAccount.accountToString());

            aliceAccount.withdraw(10, "F685746854456123");
            System.out.println(aliceAccount.accountToString());

            aliceAccount.withdraw(100, "sadasd"); // Δίνει Exception.
            System.out.println(aliceAccount.accountToString());

        } catch (NegativeAmountException e) {
            System.out.println("Το ποσό που καταθέσατε δεν είναι θετικό.");
        } catch (InsufficientBalanceException e) {
            System.out.println("Το υπόλοιπο του λογαριασμού σας δεν είναι επαρκές για την πληρωμή.");

        } catch (SssNotValidException e) {
            System.out.println("Το ssn σας δεν είναι έγκυρο");
        }
    }
}
