package gr.aueb.cf.ch13;

public class AccountMain {

    public static void main(String[] args) {
        Account aliceAccount = new Account(1, "GR4444444", "Alice", "W.", "F685746854456123", 100);

        try {
            aliceAccount.deposit(500);
            System.out.println(aliceAccount.accountToString());

            aliceAccount.withdraw(50, "F685746854456123");
            System.out.println(aliceAccount.accountToString());

            aliceAccount.withdraw(100, "AB124");   // Δίνει Exception.

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
