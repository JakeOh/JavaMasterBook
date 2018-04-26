package edu.javamasterbook.ch05.model;

import java.util.ArrayList;
import java.util.List;

public class StudentGroup {
    private List<Student> students;

    public StudentGroup() {
        students = new ArrayList<>();
    }

    public void add(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }
}
