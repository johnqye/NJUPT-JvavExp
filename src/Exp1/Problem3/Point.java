package Exp1.Problem3;

public class Point {
    private double xPos, yPos;
    
    public Point(double x, double y) { reset(x, y); }
    public Point() {reset(0, 0);}
    public double x() {return xPos;}
    public double y() {return yPos;}
    public void reset(double x, double y) {
        xPos = x; yPos = y;
    }
    public Point diffPoint(Point rhs) {
        return new Point(rhs.xPos - xPos, rhs.yPos - yPos);
    }
    public Point diffPointAbs(Point rhs) {
        Point res = diffPoint(rhs);
        if (res.xPos < 0) res.xPos = -res.xPos;
        if (res.yPos < 0) res.yPos = -res.yPos;
        return res;
    }
    public String toString() {
        return '[' + Double.toString(xPos) + ','
            + Double.toString(yPos) + ']';
    }
}
