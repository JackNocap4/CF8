package gr.aueb.cf.ch14;

public class StringUtilsMain {

    public static void main(String[] args) {
        String str = "PAok";

        System.out.println("Reversed: " + StringUtils.ReverseString(str));
        System.out.println("Uppercase: " + StringUtils.toUpperCase(str));
        System.out.println("Is Palindrome: " + StringUtils.isPalindrome(str));
    }
}
