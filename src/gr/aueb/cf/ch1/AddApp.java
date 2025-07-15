package gr.aueb.cf.ch1;

/** προσθέτει δύο ακέραιους και εμφανίζει το αποτέλεσμα στην κοσνσόλα.
 *
 */


public class AddApp {
    public static void main(String[] args) {

        // δήλωση και αρχικοποίηση τωνμ μεταβλητών
       int num3 = 5;
       int num4 = 15;
       int result = 0;


       // Εντολές
       result = num3 + num4;

       //Εκτύπωση
       System.out.println("το αποτέλεσμα είναι: " + result);
        System.out.println("To αποτέλεσμα των " + num3 +" και " + num4 + " είναι ίσο με" + result);
        System.out.printf("Tο αποτέλεσμα %d και %d είναι ίσο με: %d",num3,num4,result);
    }
}
