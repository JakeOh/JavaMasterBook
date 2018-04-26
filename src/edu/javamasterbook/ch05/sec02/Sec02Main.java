package edu.javamasterbook.ch05.sec02;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Sec02Main {

    public static void main(String[] args) {
        System.out.println("5-2. Stream");

        String[] array = {"Newton", "Einstein", "Maxwell", "Heisenberg"};
        System.out.println(array);
        Arrays.stream(array)
                .forEach(System.out::println);

        System.out.println();
        List<String> list = Arrays.asList("Newton", "Einstein", "Maxwell", "Heisenberg");
        System.out.println(list);
        list.stream()
                .forEach(System.out::println);

        System.out.println();
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Classic Mechanics");
        map.put(2, "Electrodynamics");
        map.put(3, "Quantum Mechanics");

        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
        entrySet.forEach(System.out::println);

        Stream<Map.Entry<Integer, String>> stream = map.entrySet().stream();
        stream.forEach(el ->
                System.out.println(el.getKey() + " : " + el.getValue()));

        // stream from range
        System.out.println();
        IntStream intStream = IntStream.range(1, 5);
        intStream.forEach(System.out::println);

        System.out.println();
        IntStream.rangeClosed(1, 5)
                .forEach(System.out::println);

    }

}
