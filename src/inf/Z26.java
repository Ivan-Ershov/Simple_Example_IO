package inf;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Z26 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File(".\\inf\\26.txt"));
        int s = in.nextInt();
        int n = in.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        Arrays.sort(a);

        int sum = 0;
        int i = 0;

        while (sum < s) {
            sum += a[i];
            i++;
        }

        if (sum == s) {
            System.out.print(i + " ");
            System.out.println(a[i - 1]);
        } else {
            System.out.print((i - 1) + " ");
            i--;
            sum -= a[i];
            i--;

            while ((sum < s) && (i + 1 < a.length)) {
                sum -= a[i];
                i++;
                sum += a[i];
            }

            if (sum <= s) {
                System.out.println(a[i]);
            } else {
                System.out.println(a[i - 1]);
            }
        }

    }
}
