package edu.javamasterbook.ch12.sec05;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Dirctory implements Entry {

    private String name;
    private List<Entry> list;

    public Dirctory(String name) {
        this.name = name;
        this.list = new ArrayList<>();
    }

    @Override
    public void add(Entry entry) {
        list.add(entry);
    }

    @Override
    public void remove() {
        Iterator<Entry> itr = list.iterator();
        while (itr.hasNext()) {
            Entry entry = itr.next();
            entry.remove();
        }
        System.out.println("Deleted " + name);
    }

    @Override
    public void rename(String name) {
        System.out.println("Renamed from " + this.name + " to " + name);
        this.name = name;
    }
}
