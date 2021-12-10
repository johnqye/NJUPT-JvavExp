package Exp2.Problem4;

public class Test {
    public static void main(String[] args) {
        Cylinder test = new Cylinder();
        try {
            
            System.out.println(test);
            System.out.println(test.volume());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        test.setLowerSide(new Ladder(11.4, 5, 1.4));
        test.setHeight(5.14);
        System.out.println(test.volume());
        System.out.println(test);
        
        test.setLowerSide(new Triangle());
        System.out.println(test.volume());
        System.out.println(test.getLower());
    }
}
