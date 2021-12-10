package Exp2.Problem4;

import Exp2.Problem3.Geometry;

public class Cylinder {
    private Geometry lowerSide;
    private double height;

    public Cylinder(Geometry downSide, double height) {
        this.lowerSide = downSide;
        this.height = height;
    }
    public Cylinder() { this(null, Math.random()); }

    public Geometry getLower() { return lowerSide; }
    public void setLowerSide(Geometry downSide) {
        this.lowerSide = downSide;
    }
    public double getHeight() { return height; }
    public void setHeight(double height) { this.height = height; }

    @Override
    public String toString() {
        if (lowerSide == null)
            return "Cylinder [downSide=null, height=" + height + "]";
        return "Cylinder [downSide=" + lowerSide + ", height=" + height + "]";
    }

    public double volume() throws NullPointerException {
        if (lowerSide == null)
            throw new NullPointerException("Null Down Side in Cylinder");
        return lowerSide.area() * height;
    }
}
