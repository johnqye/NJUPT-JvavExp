package Exp2.Problem3;

public class Rectangle implements Geometry {
	private double myLength;
	private double myWidth;

	public Rectangle(double l, double w) {
		setLength(l);
		setWidth(w);
	}
	public Rectangle() {this(Math.random(),Math.random());}

	public double length() { return myLength; }
	public double width() { return myWidth; }

	public void setLength(double l) {
		if (l < 0) return;
		myLength = l;
		if (myLength < myWidth) {
			myLength = myWidth;
			myWidth = l;
		}
	}

	public void setWidth(double w) {
		if (w < 0) return;
		myWidth = w;
		if (myLength < myWidth) {
			myLength = myWidth;
			myWidth = w;
		}
	}

	@Override
	public double area() {
		return myLength * myWidth;
	}
}
