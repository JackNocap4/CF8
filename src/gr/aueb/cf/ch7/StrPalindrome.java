package gr.aueb.cf.ch7;

/**
 * Ε λέγχει αν ένα sting είναι παλινδρομικό.
 * Για παράδειγμα, το "ΑttA" είναι παλινδρομικό.
 * Hint. 0 StringBuilder παρέχει την sb.reverse()
 * Hint. 0 StringBuilder παρέχει την
 */
public class StrPalindrome {

    public static void main(String[] args) {
        String s = "AttA";
        System.out.println(isPalindrome(s));

    }

    /**
     *
     * @param s
     * @return
     */
    public static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString().equals(s);
    }
}
