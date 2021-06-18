package Task27;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File(".\\Task27\\27-B.txt"));
        int n = in.nextInt();
        int minDif = Integer.MAX_VALUE;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            int y = in.nextInt();

            sum += Math.max(x, y);

            int dif = Math.abs(x - y);

            if ((dif < minDif) && (dif % 3 != 0)) {
                minDif = dif;
            }

        }

        if (sum % 3 == 0) {
            sum -= minDif;
        }

        System.out.println(sum);
    }
}
