package edu.javamasterbook.ch12.sec05;

public class Sec05Main {
    private static final int SIZE = 5;

    public static void main(String[] args) {
        System.out.println("12-5. Composite Pattern");

        File file = new File("myFile");
        Dirctory dirctory = new Dirctory("myDir");
        dirctory.add(file);
        dirctory.remove();

        File[] files = new File[SIZE];
        for (int i = 0; i < SIZE; i++) {
            files[i] = new File("file" + (i + 1));
        }
        Dirctory dir2 = new Dirctory("dir2");
        for (File f : files) {
            dir2.add(f);
        }
        dir2.rename("mydir2");
        dir2.remove();
    }

}
