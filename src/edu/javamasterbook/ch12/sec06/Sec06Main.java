package edu.javamasterbook.ch12.sec06;

public class Sec06Main {

    public static void main(String[] args) {
        System.out.println("12-06. Command Pattern");

        Book book = new Book(5000);
        Command discount = new DiscountCommand();
        discount.setBook(book);
        discount.execute();
        System.out.println("price: " + book.getPrice());

        book.setPrice(5000);
        Command specialDiscount = new SpecialDiscountCommand();
        specialDiscount.setBook(book);
        specialDiscount.execute();
        System.out.println("price: " + book.getPrice());
    }

}
