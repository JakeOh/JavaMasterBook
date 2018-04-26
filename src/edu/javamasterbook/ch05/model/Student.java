package edu.javamasterbook.ch05.model;

public class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + "'" +
                ", score=" + score +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        boolean result = false;

        if (obj instanceof Student) {
            if (name.equals(((Student) obj).name) &&
                    score == ((Student) obj).score) {
                result = true;
            }
        }

        return result;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(score);
    }
}
