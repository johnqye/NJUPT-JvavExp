package Exp2.Problem2;

import java.util.Calendar;

class Exp2 {
    public static void main(String[] args) {
        Calendar birth = Calendar.getInstance();
        birth.set(1999, 9, 9);
        People p = new People("张三", true, birth);
        System.out.println(p);
        p = new Student(p, "B17010101", "软件工程");
        birth.set(1999, 12, 1);
        System.out.println(p);
        System.out.println(new People("李四", false, birth));
    }
}