package edu.javamasterbook.ch12.sec07;

public class SpecialDiscountStrategy implements Strategy {
    @Override
    public void discount(Book book) {
        book.setPrice(book.getPrice() * 0.7);
    }
}
