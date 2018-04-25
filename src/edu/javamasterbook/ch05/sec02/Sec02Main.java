package edu.javamasterbook.ch05.sec02;

import java.util.Arrays;
import java.util.List;

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

    }

}
