package Exp1.Problem3;

public class Rectangle implements Shape {
    private Point leftUp, rightDown;
    
    public Rectangle() {reset(0, 0, 0, 0);}
    public Rectangle(double x, double y, double h, double w) {
        reset(x, y, h, w);
    }
    public void reset(double x, double y, double h, double w) {
        if (h < 0 || w < 0)
            leftUp = rightDown = null;
        else {
            leftUp = new Point(x, y);
            rightDown = new Point(h, w);
        }
    }
    public double height() {
        if (leftUp == null) return -1;
        return leftUp.diffPointAbs(rightDown).y();
    }
    public double width() {
        if (leftUp == null) return -1;
        return leftUp.diffPointAbs(rightDown).x();
    }
    @Override
    public double circumference() {
        if (leftUp == null) return -1;
        Point p = leftUp.diffPointAbs(rightDown);
        return (p.x() + p.y()) * 2;
    }
    @Override
    public double area() {
        if (leftUp == null) return -1;
        Point p = leftUp.diffPointAbs(rightDown);
        return p.x() * p.y();
    }
    @Override
    public String toString() {
        if (leftUp == null) return null;
        return "Rectangle:Leftup=" + leftUp.toString() + 
            ";Rightdown=" + rightDown.toString();
    }
    
}
