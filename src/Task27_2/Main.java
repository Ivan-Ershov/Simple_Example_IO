package Task27_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File(".\\Task27\\27989_B.txt"));
        int n = in.nextInt();
        int count2 = 0;
        int count13 = 0;
        int count26 = 0;

        for (int i = 0; i < n; i++) {
            int number = in.nextInt();

            if ((number % 2 == 0) && (number % 26 != 0)) {
                count2++;
            }

            if ((number % 13 == 0) && (number % 26 != 0)) {
                count13++;
            }

            if (number % 26 == 0) {
                count26++;
            }
        }

        int sum = count2 * count13 + count26 * (n - count26) + count26 * (count26 - 1) / 2;

        System.out.println(sum);
    }
}
