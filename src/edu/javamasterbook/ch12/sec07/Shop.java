package edu.javamasterbook.ch12.sec07;

public class Shop {
    private Strategy strategy;

    public Shop() {
    }

    public Shop(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void sell(Book book) {
        strategy.discount(book);
    }
}
