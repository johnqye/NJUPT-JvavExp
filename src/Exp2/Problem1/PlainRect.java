package Exp2.Problem1;

public class PlainRect extends Rectangle {
    private double startX;
    private double startY;

    public PlainRect() {
        super();
        startX = startY = 0;
    }
    public PlainRect(double l, double w, double x, double y) {
        super(l, w);
        startX = x; startY = y;
    }

    public double startX() { return startX; }
    public void setStartX(double startX) { this.startX = startX; }
    public double startY() { return startY; }
    public void setStartY(double startY) { this.startY = startY; }
    
    public boolean isInside(double x, double y) {
        return x > startX && x < startX + length() &&
            y > startY && y < startY + width();
    }

    @Override
    public String toString() {
        return "{ startX:" + startX + ", startY:" + startY
            + ", "+ super.toString() + " }";
    }    
}