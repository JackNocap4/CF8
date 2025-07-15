package gr.aueb.cf.ch19.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Askisi {

    public static void main(String[] args) {
        String s = "asdA1!sdg";


        Pattern pattern = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[#?!@$%^&*-]).{8,}$");
        Matcher matcher = pattern.matcher(s);

        if (matcher.matches()) {
            System.out.println("Σωστός Κωδικός");
        } else {
            System.out.println("Λάθος Κωδικός");
        }


    }
}





