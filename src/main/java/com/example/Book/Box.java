package com.example.Book;

public  class Box {
    double width;
    double height;
    double depth;
}

class BoxDemo{
    public static void main(String[] args) {
        Box box=new Box();
        double vol;

        box.width=10;
        box.height=20;
        box.depth=15;

        vol= box.width * box.height * box.depth;

        System.out.println(vol);
    }
}
