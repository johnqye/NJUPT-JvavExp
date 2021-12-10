package Exp2.Problem4;

import Exp2.Problem3.Geometry;
public class Triangle implements Geometry {
    private double length;
    private double width;

    public Triangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public Triangle() { this(Math.random(), Math.random()); }

    public double getLength() { return length; }
    public void setLength(double length) { this.length = length; }
    public double getWidth() { return width; }
    public void setWidth(double width) { this.width = width; }
    
    @Override
    public double area() {
        return length * width / 2;
    }

    @Override
    public String toString() {
        return "Triangle [length=" + length + ", width=" + width + "]";
    }
    
}
