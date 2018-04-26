package edu.javamasterbook.ch05.sec05;

import edu.javamasterbook.ch05.model.Product;

import java.util.*;
import java.util.stream.Collectors;

import static edu.javamasterbook.ch05.model.Product.Category;

public class Sec05Main {

    public static void main(String[] args) {
        System.out.println("5-5. Stream Terminal Operations");

        List<String> list = Arrays.asList("Newton", "Maxwell", "Bohr", "Heisenberg", "Schrodinger", "Einstein", "Feynman");
        System.out.println(list);

        // 1. collect()
        // 1) Collectors.toList()
        List<String> newList1 = list.stream()
                .filter(name -> name.length() >= 10)
                .collect(Collectors.toList());
        System.out.println(newList1);

        // 2) Collectors.joining()
        String joined = list.stream()
                .filter(name -> name.length() > 7)
                .collect(Collectors.joining(","));
        System.out.println(joined);

        System.out.println();
        List<Product> products = new ArrayList<>();
        products.add(new Product(100, "Han River", 10000, Category.BOOK));
        products.add(new Product(101, "Vegetarian", 15000, Category.BOOK));
        products.add(new Product(200, "MonBlanc", 20000, Category.STATIONARY));
        products.add(new Product(201, "MonAmi", 1000, Category.STATIONARY));
        products.add(new Product(300, "God Father", 5000, Category.DVD));
        products.forEach(System.out::println);
//        products.stream().forEach(System.out::println);

        System.out.println();
        // 3) Collectors.groupingBy()
        products.stream()
                .collect(Collectors.groupingBy(Product::getCategory))
                .get(Category.BOOK)
                .forEach(System.out::println);


        // 2. findFirst(), findAny(), min(), max()
        System.out.println();
        Optional<Product> result = products.stream().findFirst();
        System.out.println(result.get());

        result = products.stream()
                .min(Comparator.comparing(Product::getProductPrice));
        System.out.println(result.get());

        result = products.stream()
                .max(Comparator.comparing(Product::getProductPrice));
        System.out.println(result.get());

        // 3. count(), min(), max(), sum(), average()
        System.out.println();
        long count = products.stream().count();
        System.out.println("count = " + count);

        OptionalInt maxPrice = products.stream()
                .mapToInt(Product::getProductPrice)
                .max();
        System.out.println("max price = " + maxPrice.getAsInt());

        OptionalInt minPrice = products.stream()
                .mapToInt(Product::getProductPrice)
                .min();
        System.out.println("min price = " + minPrice.getAsInt());

        int sum = products.stream()
                .mapToInt(Product::getProductPrice)
                .sum();
        System.out.println("sum price = " + sum);

        OptionalDouble average = products.stream()
                .mapToInt(Product::getProductPrice)
                .average();
        System.out.println("average price = " + average.getAsDouble());
    }

}
