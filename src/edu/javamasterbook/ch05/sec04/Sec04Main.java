package edu.javamasterbook.ch05.sec04;

import edu.javamasterbook.ch05.model.Student;

import java.util.ArrayList;
import java.util.List;

public class Sec04Main {

    public static void main(String[] args) {
        System.out.println("5-04. Stream Intermediate Operations: filter, limit, distinct, sorted");

        List<Student> students = new ArrayList<>();
        students.add(new Student("Foo", 95));
        students.add(new Student("Boo", 88));
        students.add(new Student("Zoo", 99));
        students.add(new Student("Soo", 55));
        students.add(new Student("Kim", 60));
        students.add(new Student("Lee", 85));
        students.add(new Student("Park", 73));
        students.add(new Student("John", 67));
        students.add(new Student("Smith", 93));
        students.add(new Student("Jane", 81));
        students.add(new Student("Paul", 79));
        students.add(new Student("Foo", 95));
        students.add(new Student("Boo", 88));

        students.stream()
                .filter(student -> student.getScore() >= 80)
                .forEach(System.out::println);

        System.out.println();
        students.stream()
                .limit(3)
                .forEach(System.out::println);

        System.out.println();
        students.stream()
                .distinct()
                .forEach(s -> System.out.println(s.getName()));

        System.out.println();
        students.stream()
                .distinct()
                .sorted((s1, s2) -> s1.getScore() - s2.getScore())
                .forEach(System.out::println);

        System.out.println();
        students.stream()
                .distinct()
                .sorted((s1, s2) -> s1.getName().compareTo(s2.getName()))
                .forEach(System.out::println);
    }

}
