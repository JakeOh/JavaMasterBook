package edu.javamasterbook.ch12.sec03;

public class Sec03Main {

    public static void main(String[] args) {
        System.out.println("!2-3. Adapter Pattern Using Inheritance");

        Target target = new Adapter();
        target.process();
    }

}
