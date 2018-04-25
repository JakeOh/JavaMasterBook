package edu.javamasterbook.ch12.sec08;

public class DataChanger extends Subject {
    private int status;

    @Override
    public void execute() {
        status++;
        System.out.println("Status changed to: " + status);
        notifyObservers();
    }
}
