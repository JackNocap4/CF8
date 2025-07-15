package gr.aueb.cf.ch18.streams;

import gr.aueb.cf.ch18.sorting.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapMain {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>(List.of(new Product("Apples", 12.5, 10),
                new Product("Oranges", 8.2, 35), new Product("Apples", 22.5, 100),
                new Product("Honey", 8.2, 35)));


        var listofProductsDescriptions = products.stream()
                .map(Product::getDescription)
                .collect(Collectors.toCollection(ArrayList::new));  // .collect
        listofProductsDescriptions.forEach(System.out::println);


        var listofProductsDescriptions2 = products.stream()
                .map(Product::getDescription)
                .collect(Collectors.joining(", ")); // όταν θέλω απ τα στοιχεία του collection να φτιάξω string!
        System.out.println(listofProductsDescriptions2);


        int totalQuantities = products.stream()
                .mapToInt(Product::getQuantity)
                .sum();
        System.out.println(totalQuantities);


        double totalPrices = products.stream()
                .mapToDouble(Product::getPrice)
                .sum();
        System.out.println(totalPrices);

        System.out.println(((Object) totalQuantities).getClass().getSimpleName()); // βλέπω τι είναι τα totalQuantities


    }


}
