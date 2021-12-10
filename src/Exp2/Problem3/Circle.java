package Exp2.Problem3;

public class Circle implements Geometry {
	private double myRadius;
	@Override
	public double area() {
		return Math.PI * myRadius * myRadius;
	}

	public Circle() { this(Math.random()); }
	public Circle(double radius) {myRadius = radius;}

	public double radius() {return myRadius;}
	public void setRadius(double r) { 
		if (r > 0)
			myRadius = r;
	}
}
