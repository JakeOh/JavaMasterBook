package edu.javamasterbook.ch05.sec06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Sec06Main {

    public static void main(String[] args) {
        System.out.println("5-6. Tips to Stream APIs");

        // 1. filter, map, collect
        List<String> list = Arrays.asList("Java", "Kotlin", "Swift", "JavaScript", "C#");
        List<String> newList = list.stream()
                .filter(s -> s.length() > 5)
                .map(s -> "'" + s + "'")
                .collect(Collectors.toList());
        System.out.println(newList);

        // 2. loop -> IntStream
        System.out.println();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            if (i != 0) {
                builder.append(",");
            }
            builder.append("?");
        }
        System.out.println(builder.toString());

        String query = IntStream.range(0, 5)
                .mapToObj(n -> "?")
                .collect(Collectors.joining(","));
        System.out.println(query);

        // 3. List, Map APIs added in Java 8 (Not Stream APIs, but similar)
        System.out.println();
        // N.B. java.util.Arrays.asList() produces an list from which it is
        // impossible to remove elements, so it throws on a removal attempt.
        // You could wrap it with ArrayList:
        List<String> list2 = new ArrayList<>(list);
        System.out.println(list2);
        list2.removeIf(s -> s.length() <= 5);
        list2.replaceAll(s -> s.toUpperCase());
        list2.forEach(System.out::println);
    }

}
