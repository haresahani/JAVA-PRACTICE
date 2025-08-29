package oop;

public class GetterSetter {
    public static void main(String[] args) {
        Pens p1 = new Pens();
        p1.setColor("yellow");
        p1.setTip(5);

        System.out.println(p1.getColor());
        System.out.println(p1.getTip());

    }
}

class Pens {
    //Attributes(properties)
    private String color;
    private int tip;

    //getter
    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    //setter
    void setColor(String color) {
        this.color = color;
    }

    void setTip(int tip) {
        this.tip = tip;
    }
}