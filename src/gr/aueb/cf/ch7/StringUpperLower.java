package gr.aueb.cf.ch7;

/**
 * Μετατρέπει σε Lower-case ή
 * upper-case
 */
public class StringUpperLower {

    public static void main(String[] args) {


    String str1 = "Athens";
    String str2 = "ATHENS";

    String upper = str1.toUpperCase();
    String lower = str1.toLowerCase();


    // Αν δεν είχαμε την equalIgnoreCase() πως θα συγκρίναμε
    // case insensitive
    // Normalization των Strings σε κεφαλαία και σύγκριση


    boolean areEqual =  str1.toUpperCase().equals(str2.toUpperCase());
        System.out.println(areEqual);

    }
}
