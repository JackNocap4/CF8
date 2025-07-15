package gr.aueb.cf.ch4;

/**
 * demo for surrogate pairs
 */
public class UnicodeApp {

    public static void main(String[] args) {
        int codePoint = 0x1F60A;
        System.out.println(Character.toChars(codePoint));
        System.out.println("\u20ac");// sos
        System.out.println("\u00A9");// sos
        System.out.println("\u2103");// sos
        System.out.println("\u2109");// sos
    }
}
