package oop;

public class OOP {
    public static void main(String[] args) {
        //Object - Pen
        Pen p = new Pen();
        p.setColor("blue");
        System.out.println(p.color);
        p.setTip(5);
        System.out.println(p.tip);

    }
}
//PEN
class Pen { //class

    //Attributes(properties)
    String color;
    int tip;

    //function()
    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }

}