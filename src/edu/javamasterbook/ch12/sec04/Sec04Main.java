package edu.javamasterbook.ch12.sec04;

public class Sec04Main {

    public static void main(String[] args) {
        System.out.println("12-3. Adapter Pattern Using Delegation");

        Target target = new Adapter(new OldSystem());
        target.process();
    }

}
