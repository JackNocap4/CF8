package gr.aueb.cf.ch13.askisi;

public class StringUtils {

    public static String reverse(String s) {
        String reversed = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed += s.charAt(i);
        }
        return reversed;
    }

    public static String toUpperCase(String s) {
        return s.toUpperCase();
    }

    public static boolean isPalindrome(String s) {
        String reversed = reverse(s);
        return s.equals(reversed);
    }
}
