package edu.javamasterbook.ch12.sec04;

public class Adapter extends Target {
    private OldSystem system;

    public Adapter(OldSystem system) {
        this.system = system;
    }

    @Override
    public void process() {
        system.oldProcess();
    }
}
