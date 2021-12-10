package Exp1.Problem3;

public class Circle implements Shape{
    private static final double PI = 3.1415926536;
    private Point center;
    private double r;

    public Circle(double x, double y, double radius) {
        this.center = new Point(x, y); 
        this.r = radius;
    }
    public Circle() { center = new Point(); r = 0; }

    public void setPoint(double x, double y) {
        center = new Point(x, y); 
    }    
    public void setRadius(double rady) {
        r = rady; 
    }
    public Point centerPoint() {return center;}
    public double radius() {return r;}
    @Override
    public String toString() {
        return "Circle:" + center.toString() + ":Radius:"
            + Double.toString(r);
    }
    @Override
    public double area() {
        return PI * r * r;
    }
    @Override
    public double circumference() {
        return PI * r * 2;
    }
}
