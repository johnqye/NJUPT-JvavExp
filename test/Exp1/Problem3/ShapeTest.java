package Exp1.Problem3;

public class ShapeTest {
    public static void shapeInfo(Shape shape) {
        System.out.println(shape.toString());
        System.out.println("图形的周长：" + shape.circumference());
        System.out.println("图形的面积：" + shape.area());
        if (shape.getClass() == Circle.class) {
            Circle c = (Circle) shape;
            System.out.println("圆的中心" + c.centerPoint());
            System.out.println("圆的半径" +c.radius());
        } else if (shape.getClass() == Rectangle.class) {
            Rectangle r = (Rectangle) shape;
            System.out.println("矩形高度" + r.height());
            System.out.println("矩形宽度" +r.width());
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(1, 1, 4.5, 1.4);
        shapeInfo(rect);
        rect.reset(7, 2, 3, 4);
        shapeInfo(rect);
        Circle circle = new Circle(1.1, 4.5, 1.4);
        shapeInfo(circle);
        circle.setPoint(2.2, 3.3);
        circle.setRadius(4.4);
        shapeInfo(circle);
    }
}
