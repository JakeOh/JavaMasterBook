package edu.javamasterbook.ch12.sec02;

public class Sec02Main {

    public static void main(String[] args) {
        System.out.println("12-2. Builder Pattern");

        Director director = new Director(new TopPageBuilder());
        Page topPage = director.construct();

        System.out.println(topPage.getHeader());
        System.out.println(topPage.getContents());
        System.out.println(topPage.getFooter());
    }

}
