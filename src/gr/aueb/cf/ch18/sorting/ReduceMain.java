package gr.aueb.cf.ch18.sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ReduceMain {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 14);



    List<Product> products = new ArrayList<>(List.of(new Product("Apples", 12.5, 10),
            new Product("Oranges", 8.2, 35), new Product("Apples", 22.5, 100),
            new Product("Honey", 8.2, 35)));



    int totalSum = numbers.stream().reduce(0, (sum, n) -> sum + n);
        System.out.println(totalSum);

    int totalSum2 = numbers.stream().reduce(0, Integer::sum);
        System.out.println(totalSum2);

    int sumOfQuantities = products.stream()
            .map(Product::getQuantity)
            .reduce(0, Integer::sum);
        System.out.println(sumOfQuantities);


    var sortedProductDescriptions = products.stream()
            .filter(p-> p.getQuantity() == 100 )
            .sorted(Comparator.comparing(Product::getDescription))
            .map(Product::getDescription)
            .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(sortedProductDescriptions);


    }

}
