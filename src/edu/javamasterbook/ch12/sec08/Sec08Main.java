package edu.javamasterbook.ch12.sec08;

public class Sec08Main {

    public static void main(String[] args) {
        System.out.println("12-8. Observer Pattern");

        Observer observer = new Client();
        Subject dataChanger = new DataChanger();

        dataChanger.addObserver(observer);
        for (int i = 0; i < 10; i++) {
            dataChanger.execute();

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
