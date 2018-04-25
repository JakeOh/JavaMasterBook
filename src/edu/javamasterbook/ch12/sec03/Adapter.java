package edu.javamasterbook.ch12.sec03;

public class Adapter extends OldSystem implements Target {
    @Override
    public void process() {
        oldProcess();
    }
}
