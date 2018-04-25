package edu.javamasterbook.ch05.sec01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sec01Main {

    public static void main(String[] args) {
        System.out.println("5-1. Anonymous Class vs Lambda");

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Newton", 100));
        studentList.add(new Student("Einstein", 70));
        studentList.add(new Student("Feynman", 89));
        studentList.add(new Student("Heisenberg", 99));
        studentList.add(new Student("Maxwell", 55));

        System.out.println(studentList);

        // anonymous class
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getName().compareTo(s2.getName());
            }
        });
        System.out.println(studentList);

        // lambda expression
        Collections.sort(studentList,
                (s1, s2) -> s1.getScore() - s2.getScore());
        System.out.println(studentList);

        // method reference
        System.out.println();
        studentList.forEach(System.out::println);
//        studentList.forEach(student -> System.out.println(student));
        // same result
    }

}
