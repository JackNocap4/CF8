package gr.aueb.cf.ch4;

/**
 * Να εκτυπώσει 10 γραμμές με αστεράκια
 * όπου στην 1η γραμμή 10 αστεράκια, στη 2η
 * 9 αστεράκια μέχρι τη 10 με ένα αστεράκι
 */

public class StarsDesc10 {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            for (int j = 10; j >= i; j--) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
