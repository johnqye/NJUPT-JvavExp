package Exp2.Problem4;
import Exp2.Problem3.Geometry;
public class Ladder implements Geometry{
    private double upLength;
    private double downLength;
    private double width;
    
    public Ladder() { 
        this(Math.random(), Math.random(), Math.random());
    }
    public Ladder(double upLength, double downLength, double width) {
        this.upLength = upLength;
        this.downLength = downLength;
        this.width = width;
    }

    public double getUpLength() { return upLength; }
    public void setUpLength(double ul) { upLength = ul; }
    public double getDownLength() { return downLength; }
    public void setDownLength(double dl) { downLength = dl; }
    public double getWidth() { return width; }
    public void setWidth(double width) { this.width = width; }

    @Override
    public double area() {
        return (upLength + downLength) * width / 2;
    }
    @Override
    public String toString() {
        return "Ladder [downLength=" + downLength 
            + ", upLength=" + upLength 
            + ", width=" + width + "]";
    }
}
