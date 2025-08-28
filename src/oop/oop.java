package oop;

public class oop {
    public static void main(String[] args) {
        Pen p = new Pen();
        p.changeThickness(5);
        p.changeColor("yellow");
        System.out.println(p.color);
        System.out.println(p.thickness);
    }
}

class Pen{
    //class has two things -> 1. attributes(properties) 2. method(function)

    //attributes or properties
    String color;
    int thickness;

    //method or function
    void changeColor(String setColor) {
        color = setColor;
    }

    void changeThickness(int setThickness) {
        thickness = setThickness;
    }
}
