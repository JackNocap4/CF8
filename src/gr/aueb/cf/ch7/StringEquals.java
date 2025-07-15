package gr.aueb.cf.ch7;

public class StringEquals {

    public static void main(String[] args) {
        String s1 = "Athens";
        String s2 = "Athens";
        String s3 = new String("Athens");
        String s4 = "ATHENS";


        boolean equals1 = s1 == s2;  // true, γιατί και το s1 και το s2 δείχνουν στην ίδια θέση.
        boolean equals2 = s1 == s3; // false, γιατί το s3 λόγω του new παίρνει άλλη θέση στο Heap.

        boolean equals3 = s1.equals(s2); // true
        boolean equals4 = s1.equals(s3);  // true, γιατί έτσι ελέγχουμε booleans με .equals

        boolean equals5 = s1.equals(s4);              //false
        boolean equals6 = s1.equalsIgnoreCase(s4);    //true, γιατι η equalsIgnoreCase, όπως λέει και το όνομα αψιφεί τα Κεφαλαία.
    }
}

