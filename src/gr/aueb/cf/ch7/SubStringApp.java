package gr.aueb.cf.ch7;

/**
 * Parsing of a String finding
 * a substring.
 */
public class SubStringApp {

    public static void main(String[] args) {
        String s = "Coding Factory";
        String subStr1;
        String subStr2;

        subStr1= s.substring(1); // oding Factory
        subStr2 = s.substring(1, 3);      // od

        System.out.println(subStr1);
        System.out.println(subStr2);
    }
}
