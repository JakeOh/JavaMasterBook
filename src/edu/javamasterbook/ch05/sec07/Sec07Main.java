package edu.javamasterbook.ch05.sec07;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Sec07Main {

    public static void main(String[] args) {
        System.out.println("5-7. Initializing Lists Using Stream APIs");

        List<String> strList = Stream.of("Kim", "Moon")
                .collect(Collectors.toList());
        System.out.println(strList);

        List<Integer> intList = Stream.of(1, 11, 111, 22, 3)
                .collect(Collectors.toList());
        System.out.println(intList);

        List<Integer> intList1 = IntStream.of(1, 10, 100, 1, 99, 999)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(intList1);

        List<Integer> intList2 = IntStream.rangeClosed(1, 10)   // cf. range(start, end)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(intList2);

        System.out.println("\nInitializing Arrays Using Stream APIs");
        String[] strArray = Stream.of("Moon", "Kim")
                .toArray(i -> new String[i]);
        System.out.println(strArray);
        for (String s : strArray) {
            System.out.print(s + " ");
        }
        System.out.println();

        Integer[] intArray = Stream.of(1, 2, 3)
                .toArray(n -> new Integer[n]);
        System.out.println(intArray);
        for (Integer x : intArray) {
            System.out.print(x + " ");
        }
        System.out.println();

        Integer[] intArray1 = IntStream.of(10, 20, 30).boxed()
                .toArray(n -> new Integer[n]);
        System.out.println(intArray1);
        for (Integer x : intArray1) {
            System.out.print(x + " ");
        }
        System.out.println();

    }

}
