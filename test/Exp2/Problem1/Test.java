package Exp2.Problem1;

public class Test {
    public static void main(String[] args) {
        PlainRect tester = new PlainRect(20, 10, 10, 10);
        System.out.println(tester.area());
        System.out.println(tester.perimeter());
        System.out.println(tester.isInside(25.5, 13));
        System.out.println(tester);
    }
}