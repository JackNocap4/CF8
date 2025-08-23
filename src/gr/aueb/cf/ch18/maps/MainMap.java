package gr.aueb.cf.ch18.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;


public class MainMap {

    public static void main(String[] args) {
        Map<String, String> countries = new HashMap<>();


        // Add
        countries.put("GR", "Greece");
        countries.put("US", "United States");
        countries.put("EN", "England");

        // Update
        countries.put("US", "U. States");

        // Get
        String value = countries.get("GR");
        System.out.println(value);

        // Remove
        countries.remove("Gr");

        // Iterate
        for (Map.Entry<String, String> entry: countries.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " value: " + value);
        }

        countries.forEach((k, v) ->System.out.println("Key: " + k + "value: " + v));

        var filteredCountries = countries.entrySet().stream()
                .filter(e -> e.getKey().length() <= 2)
                .collect(Collectors.toSet());

        filteredCountries.forEach(System.out::println);
        System.out.println(filteredCountries);
    }

}
