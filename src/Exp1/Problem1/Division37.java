package Exp1.Problem1;

public class Division37 {
    public static void main(String[] args) {
        int res = 0;
        for (int i = 3; i < 1000; i++)
            if (i % 3 == 0 && i % 7 == 0)
                res += i;
        System.out.println(res);
    }
}