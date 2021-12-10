package Exp2.Problem1;

public class Rectangle extends Exp2.Problem3.Rectangle {
    public Rectangle() { super(0, 0); }
    public Rectangle(double l, double w) { super(l, w); }

    public double perimeter() {return 2 * (width() + length()); }
    
    @Override
    public String toString() {
        return "{ height: " + length() + ", width: "
            + width() + " }";
    }
}