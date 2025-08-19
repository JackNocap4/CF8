package gr.aueb.cf.ch13.askisi;

public class StringUtilsMain {

    public static void main(String[] args) {

        String text1 = "level";
        String text2 = "hello";

        System.out.println("Reverse of level: " + StringUtils.reverse(text1));
        System.out.println("Reverse of hello: " + StringUtils.reverse(text2));
        System.out.println("Uppercase of level: " + StringUtils.toUpperCase(text1));
        System.out.println("Uppercase of hello: " + StringUtils.toUpperCase(text2));
        System.out.println("Is level Palindrome? " + StringUtils.isPalindrome(text1));
        System.out.println("Is hello Palindrome? " + StringUtils.isPalindrome(text2));
    }
}

