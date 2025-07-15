package gr.aueb.cf.ch7;

/**
 * Αντικαθιστά ένα substring με ένα άλλο.
 */
public class StringReplace {

    public static void main(String[] args) {
        String s1 = "Coding Factory";
        String s2 = "Coding.Factory";
        String s3 = "Coding          Factory";

        String replaced1 = s1.replace(" ", ":");
        System.out.println(replaced1);

        String replaced2 = s2.replaceAll("\\.", ""); //εδω παίρνει \\. γτ σκέτο τελεία σημαίνει οποιοσδήποτε χαρακτήρας.
        System.out.println(replaced2);

        String replaced3 = s3.replaceAll("\\s+", " "); // \\s σημαίνει όποιοδήποτε space και \\s+ 1 ή περισσότερα spaces.
        System.out.println(replaced3);
    }
}
