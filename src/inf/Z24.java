package inf;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Z24 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(".\\inf\\24.txt"));
        String pattern = "XZZY";
        int max = Integer.MIN_VALUE;
        int count = 3;
        String str = (char) in.read() + "" + (char) in.read() + (char) in.read();

        while (in.ready()) {
            str = str + (char) in.read();
            if (str.equals(pattern)) {
                if (max < count) {
                    max = count;

                }
                count = 3;
            } else {
                count++;
            }

            str = str.substring(1);
        }

        if (max < count) {
            max = count;
        }

        System.out.println(max);
    }
}
