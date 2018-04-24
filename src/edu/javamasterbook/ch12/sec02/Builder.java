package edu.javamasterbook.ch12.sec02;

public interface Builder {

    void createHeader();
    void createContents();
    void createFooter();
    Page getPage();

}
