package edu.javamasterbook.ch12.sec07;

public class Sec07Main {

    public static void main(String[] args) {
        System.out.println("12-7. Strategy Pattern");

        Shop bookStore = new Shop(new DiscountStrategy());

        Book comicBook = new Book(5000);
        bookStore.sell(comicBook);
        System.out.println("comic book price: " + comicBook.getPrice());

        bookStore.setStrategy(new SpecialDiscountStrategy());
        Book technicalBook = new Book(15000);
        bookStore.sell(technicalBook);
        System.out.println("technical book price: " + technicalBook.getPrice());
    }

}
