package Exp1.Problem2;

import java.util.Random;
import java.util.Scanner;

public class ArrayWorst {

    private static int[] randArray(int length) {
        if (length < 0) return null;
        int[] res = new int[length];
        Random rng = new Random();
        for (int i = 0; i < length; i++)
            res[i] = rng.nextInt() % 50 + 51;
        return res;
    }

    private static int findArray(int[] array, int last, int value) {
        int len = last, low = 0;
        while (len != 0) {
            int step = len / 2;
            if (array[low + step] < value) {
                len -= step + 1;
                low += step + 1;
            } else len = step;
        }
        return low;
    }

    private static void sortArray(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int idx = findArray(array, i, array[i]);
            for (int j = i; j > idx; j--) {
                int tmp = array[j];
                array[j] = array[j - 1];
                array[j - 1] = tmp;
            }
        }
    }

    private static void outputArray(int[] array) {
        for (int i = 0; i < array.length; i++)
            System.out.printf("%d ", array[i]);
        System.out.println();
    }

    public static void main(String[] args) {
        int[] tst = randArray(10);
        sortArray(tst);
        // Arrays.sort(tst);
        outputArray(tst);
        System.out.println("Input a number:");
        Scanner jin = new Scanner(System.in);
        int toFind = jin.nextInt();
        int lowerBound = findArray(tst, 10, toFind);
        if (lowerBound < 10 && tst[lowerBound] == toFind)
            System.out.println(toFind + " is found at index " + lowerBound);
        else System.out.println(toFind + " is not found");
        jin.close();
    }
}