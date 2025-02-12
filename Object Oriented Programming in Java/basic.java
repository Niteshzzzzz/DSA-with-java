public class basic {

    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("red");
        System.out.println(p1.color);    
    }
}

class Pen {
    String color;
    int tip;
    void setColor(String color) {
        this.color = color;
    }    
}