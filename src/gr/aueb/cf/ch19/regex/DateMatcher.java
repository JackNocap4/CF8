package gr.aueb.cf.ch19.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Na το μετατρέψω σε ελληνική μορφή.
 */
public class DateMatcher {

    public static void main(String[] args) {
        String date = "06/16/2025 01/02/2012 05/07/1990";      // mm/dd/yyyy


        Pattern pattern = Pattern.compile("(\\d{2})/(\\d{2})/(\\d{4})");
        Matcher matcher = pattern.matcher(date);

        while (matcher.find()) {
            System.out.println(matcher.group());

            String month = matcher.group(1);
            String day = matcher.group(2);
            String year = matcher.group(3);

            String grDate = "GRDate: " + day + "/" + month + "/" + year;
            System.out.println(grDate);
        }
    }
}
