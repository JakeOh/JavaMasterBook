package edu.javamasterbook.ch05.sec03;

import edu.javamasterbook.ch05.model.StudentGroup;
import edu.javamasterbook.ch05.model.Student;

import java.util.ArrayList;
import java.util.List;

public class Sec03Main {

    public static void main(String[] args) {
        System.out.println("5-3. Stream Intermediate Operations: map, flatMap");

        List<Student> students = new ArrayList<>();
        students.add(new Student("Foo", 95));
        students.add(new Student("Boo", 88));
        students.add(new Student("Zoo", 99));
        students.add(new Student("Soo", 55));

        students.stream()
                .map(student -> student.getScore())
                .forEach(System.out::println);

        System.out.println();
        students.stream()
                .map(Student::getScore)
                .forEach(System.out::println);

        System.out.println();
        StudentGroup group1 = new StudentGroup();
        group1.add(new Student("Kim", 60));
        group1.add(new Student("Lee", 85));
        group1.add(new Student("Park", 73));

        StudentGroup group2 = new StudentGroup();
        group2.add(new Student("John", 67));
        group2.add(new Student("Smith", 93));
        group2.add(new Student("Jane", 81));
        group2.add(new Student("Paul", 79));

        StudentGroup group3 = new StudentGroup();
        group3.add(new Student("Newton", 59));
        group3.add(new Student("Bohr", 99));

        List<StudentGroup> groups = new ArrayList<>();
        groups.add(group1);
        groups.add(group2);
        groups.add(group3);

        List<Student> allStudents = new ArrayList<>();
        groups.stream()
                .forEach(group -> allStudents.addAll(group.getStudents()));
        allStudents.stream()
                .sorted((s1, s2) -> s1.getScore() - s2.getScore())
                .forEach(System.out::println);

        System.out.println();
        groups.stream()
                .flatMap(group -> group.getStudents().stream())
                .sorted((s1, s2) -> s1.getScore() - s2.getScore())
                .forEach(System.out::println);
    }

}
