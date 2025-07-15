package gr.aueb.cf.ch10;

/**
 * Συνδυάστε τις δύο παραπάνω μεθόδους για να γράψετε μία μέθοδο που θα λαμβάνει ως είσοδο ένα string s, το πλήθος των πρώτων γραμμάτων
 * που θέλουμε να ελέγξουμε καθώς και τον χαρακτήρα αναζήτησης ch και επιστρέφει το πλήθος των φορών που εμφανίζεται ο χαρακτήρας ch,
 * στους πρώτους n χαρακτήρες του string s. Αν το n είναι μεγαλύτερο από το length του String,
 *το String θα πρέπει να γίνεται repeat ώστε το τελικό μήκος του String να είναι αμέσως μεγαλύτερο από το μήκος του n.
 * βασικά.. Να γράψετε μία μέθοδο που θα λαμβάνει ως είσοδο ένα string s, το πλήθος των πρώτων γραμμάτων που θέλουμε
 * να ελέγξουμε καθώς και τον χαρακτήρα αναζήτησης ch και επιστρέφει το πλήθος των φορών που
 * εμφανίζεται ο χαρακτήρας ch, στους πρώτους n χαρακτήρες του string s. Αν το n είναι μεγαλύτερο από το length του String,
 *το String θα πρέπει να γίνεται repeat ώστε το τελικό μήκος του String να είναι αμέσως μεγαλύτερο από το μήκος του n.
 */
public class Askisi4Sindiasmos23 {

    public static void main(String[] args) {

        String s = "abcac";
        char ch = 'a';
        int n = 10;

        int result1 = getCount(s, ch, n);
        int result2 = getCount2(s, ch, n);

        System.out.println("Result using getCount(): " + result1);
        System.out.println("Result using getCount2(): " + result2);

    }


    public static  int getCount(String s, char ch, int n) {
        String repeatedString = "";
        int repeatedTimes;
        int count = 0;

        if (s.length() < n) {
            repeatedTimes = (int) Math.ceil((double) n / s.length());
            repeatedString = s.repeat(repeatedTimes);
        } else repeatedString = s;

        for (int i = 0; i < n; i++) {
            if (repeatedString.charAt(i) == ch) count++;
        }
        return count;
    }

    public static int getCount2(String s, char ch, int n) {
        int count = 0;
        int iterations = 0;
        int totalCount = 0;
        int remaing = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) count++;
        }

        iterations = n / s.length();
        totalCount = iterations * count;

        remaing = n%s.length();
        for (int i = 0; i < remaing; i++) {
            if (s.charAt(i) == ch) totalCount++;
        }
        return totalCount;
    }
}
