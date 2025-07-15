package gr.aueb.cf.ch2;

/** προσθέτει 2 ακεραίους αλλά το αποτέλεσμα
 * δημιουργεί υπερχείληση (overflow)
 */
public class OverflowApp {
    public static void main(String[] args) {
        int num1 = 2_147_483_647;
        int num2 = 0;
        int result = 0;

        result = num1 + num2;

        System.out.println("Tο αποτέλεσμα είναι¨: " + result);


    }
}
