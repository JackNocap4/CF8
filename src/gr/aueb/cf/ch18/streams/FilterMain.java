package gr.aueb.cf.ch18.streams;

import java.util.List;
import java.util.stream.Collectors;

public class FilterMain {

    public static void main(String[] args) {
        List<String> cities = List.of("Athens", "Toronto", "Tunis", "Athens", "Baltimore");

        var filteredCities = cities.stream()
                .filter(city -> {
                    return city.startsWith("T");  // η startsWith ονομάζεται predicate = boolean function δλδ επιστρέφει true or false.
                })
                .toList();                        // επιστρέφει ένα immutable. Το μετατρέπει σε λίστα.

        System.out.println(filteredCities);

        var filteredCities2 = cities.stream()
                .filter(city -> city.startsWith("T"))
                .collect(Collectors.toList());    // επιστρέφει mutable.

    }
}
