package Task26;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File(".\\Task26\\input.txt"));

        int size = in.nextInt();
        int n = in.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        Arrays.sort(a);

        int sum = 0;
        int i = 0;

        while (sum < size) {
            sum += a[i];
            i++;
        }

        i--;
        sum -= a[i];

        System.out.print(i + " ");

        while (sum < size) {
            sum -= a[i - 1];
            sum += a[i];
            i++;
        }

        if (sum > size) {
            i--;
        }

        System.out.println(a[i - 1]);
    }
}
