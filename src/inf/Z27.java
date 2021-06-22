package inf;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Z27 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File(".\\inf\\27_B.txt"));
        int n = in.nextInt();
        int k = 109;
        long maxSum = 0;
        int minDif = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            maxSum += Math.max(a, Math.max(b, c));

            int difAB = Math.abs(a - b);
            int difBC = Math.abs(b - c);
            int difAC = Math.abs(a - c);

            if (difAB % k == 0) {
                difAB = Integer.MAX_VALUE;
            }

            if (difBC % k == 0) {
                difBC = Integer.MAX_VALUE;
            }

            if (difAC % k == 0) {
                difAC = Integer.MAX_VALUE;
            }

            minDif = Math.min(minDif, Math.min(difAB, Math.min(difAC, difBC)));
        }

        if (maxSum % k == 0) {
            maxSum -= minDif;
        }

        System.out.println(maxSum);
    }
}
