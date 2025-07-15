package gr.aueb.cf.ch10;

/**
 * Γράψτε μία μέθοδο που δοσμένου ενός string s και ενός ακεραίου n επιστρέφει ένα string που αποτελεί επανάληψη του s ,
 * n φορές. Επίσης γράψτε και άλλη μία έκδοση της παραπάνω μεθόδου που να λαμβάνει το string s και
 * ένα ακέραιο n και να επιστρέφει ένα string με τόσες επαναλήψεις ώστε το πλήθος των γραμμάτων του τελικού
 * string να είναι μεγαλύτερο από ένα ακέραιο, έστω n.
 */
public class Askisi2StringNfores {

    public static void main(String[] args) {
        String s = "PAOK";
        System.out.println(getReapeated1(s, 5));
        System.out.println(getRepeated2(s, 10));
    }

    public static String getReapeated1(String s, int times){
        return s.repeat(times);
    }

    public static String getRepeated2(String s, int n) {
        int times;

        times = (int) Math.ceil ((double) n / s.length());
        return s.repeat(times);
    }
}
