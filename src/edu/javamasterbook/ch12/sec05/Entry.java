package edu.javamasterbook.ch12.sec05;

public interface Entry {

    void add(Entry entry);
    void remove();
    void rename(String name);

}
