package gr.aueb.cf.ch10;

/**
 * Γράψτε μία μέθοδο που δοσμένου ενός string s, ενός χαρακτήρα ch
 * και ενός αριθμού n βρίσκει το πλήθος των φορών
 * που εμφανίζεται ο χαρακτήρας ch, στους πρώτους n χαρακτήρες του string s
 */
public class Askisi3 {

    public static void main(String[] args) {
        String s = "abracadabra";
        char ch = 'a';
        int n = 7;

        int result = getCount(s, ch, n);
        System.out.println("Ο χαρακτήρας '" + ch + "' εμφανίζεται " + result + " φορές στους πρώτους " + n + " χαρακτήρες.");

    }
    public static int getCount(String s, char ch, int n) {
        int count = 0;

        if (n > s.length()) return 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == ch) count++;
        }
        return count;
    }
}
