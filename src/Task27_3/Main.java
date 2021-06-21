package Task27_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File(".\\Task27\\27_B.txt"));
        int n = in.nextInt();
        int[] max = getArray();
        int a = in.nextInt();
        int b = in.nextInt();

        max[a % 10] = Math.max(a, max[a % 10]);
        max[b % 10] = Math.max(b, max[b % 10]);

        for (int i = 1; i < n; i++) {
            a = in.nextInt();
            b = in.nextInt();
            System.out.println(a + " " + b);
            int[] newMax = getArray();

            for (int j = 0; j < 10; j++) {
                int numberA = -1;
                int numberB = -1;
                int remainA = (10 + j - (a % 10)) % 10;
                int remainB = (10 + j - (b % 10)) % 10;

                if (max[remainA] != -1) {
                    numberA = max[remainA] + a;
                }

                if (max[remainB] != -1) {
                    numberB = max[remainB] + b;
                }

                newMax[j] = Math.max(numberA, numberB);
            }

            max = newMax;
        }

        System.out.println(Arrays.toString(max));
    }

    public static int[] getArray() {
        int[] array = new int[10];

        for (int i = 0; i < 10; i++) {
            array[i] = -1;
        }

        return array;
    }
}
