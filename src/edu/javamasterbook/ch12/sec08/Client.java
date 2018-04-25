package edu.javamasterbook.ch12.sec08;

public class Client implements Observer {
    @Override
    public void update(Subject subject) {
        System.out.println("Received notification!");
    }
}
