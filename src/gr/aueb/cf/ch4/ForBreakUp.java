package gr.aueb.cf.ch4;

/**
 * Χρήση break για να διακόψουμε την
 * εκτέλεση της for.
 */

public class ForBreakUp {

    public static void main(String[] args) {

        for (int i =1; i <= 10; i++) {
            System.out.print(i + " ");
            if(i == 5) break;
        }
    }
}
