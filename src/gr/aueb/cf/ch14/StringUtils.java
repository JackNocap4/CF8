package gr.aueb.cf.ch14;

public class StringUtils {


    public static String ReverseString(String s) {
        if (s == null) return null;
        return new StringBuilder(s).reverse().toString();


    }

    public static String toUpperCase(String s) {
        if (s == null) return null;

        return s.toUpperCase();
    }

    public static boolean isPalindrome(String s) {  // η isBoolean είναι palindrome.
        if (s == null) return false;

        String clean = s.replaceAll("\\s + ", "").toLowerCase();
        String reversed = ReverseString(clean);
        return clean.equals(reversed);

    }

}
