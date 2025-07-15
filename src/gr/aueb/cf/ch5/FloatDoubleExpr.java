package gr.aueb.cf.ch5;

/**
 * Δηλώσεις και παραστάσεις float και double
 */
public class FloatDoubleExpr {

    public static void main(String[] args) {
        int intNum = 10;
        float floatNum = 0.1F; //κάνω typecast και μετατρέπω το float σε double με το F. Επειδή το 0.1 θεωρείται double.
        double doubleNum = 12.5;
        double doubleNum2 = 10d; // για typecast αν και το κάνει αυτόματα η java (θα μπορούσα να γράψω 10.0).
        float floatResult = 0.0F;
        double doubleResult = 0.0;
        final double PI = 3.1415;
        final float LIGHT_SPEED = 3.0e5F; // 3 επί 10 εις την πέμπτη.
        double div;
        double remaining;

        // Παραστάσεις με Αριθμητικούς Τελεστές
        // +, -, *, /, % --> η διαίρεση δίνει το αποτέλεσμα της διαίρεσης σε αντίθεση με τα int.

        floatResult = floatNum + intNum; // ο intNum θα γίνει float.
        doubleResult = doubleNum + floatNum - intNum; //γίνονται promote στον μεγαλύτερο τύπο
        div = 12.5 / 3;
        remaining = 12.5 % 3;

        System.out.println("Div: " + div);
        System.out.println("Mod: " + remaining);
        System.out.printf("Div: %.2f\n", div); //για να έχω 2 δεκαδικά
        System.out.printf("Mod: %05.2f\n", remaining);
    }
}