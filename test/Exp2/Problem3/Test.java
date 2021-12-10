package Exp2.Problem3;

public class Test {
	public static void main(String[] args) {
		Geometry g = new Circle(5);
		System.out.println(g.area());
		g = new Rectangle(2,3);
		System.out.println(g.area());
	}
}
