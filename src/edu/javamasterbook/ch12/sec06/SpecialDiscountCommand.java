package edu.javamasterbook.ch12.sec06;

public class SpecialDiscountCommand extends Command {
    @Override
    public void execute() {
        double price = book.getPrice();
        book.setPrice(price * 0.7);
    }

}
