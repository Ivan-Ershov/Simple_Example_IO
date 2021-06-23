package inf;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Z27 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File(".\\inf\\27_B.txt"));
        long n = in.nextInt();
        long k = 109;
        long maxSum = 0;
        long minDif = Long.MAX_VALUE;

        for (long i = 0; i < n; i++) {
            long a = in.nextInt();
            long b = in.nextInt();
            long c = in.nextInt();

            maxSum += Math.max(a, Math.max(b, c));

            long difAB = Math.abs(a - b);
            long difBC = Math.abs(b - c);
            long difAC = Math.abs(a - c);

            if (difAB % k == 0) {
                difAB = Long.MAX_VALUE;
            }

            if (difBC % k == 0) {
                difBC = Long.MAX_VALUE;
            }

            if (difAC % k == 0) {
                difAC = Long.MAX_VALUE;
            }

            minDif = Math.min(minDif, Math.min(difAB, Math.min(difAC, difBC)));
        }

        if (maxSum % k == 0) {
            maxSum -= minDif;
        }

        System.out.println(maxSum);
    }
}
