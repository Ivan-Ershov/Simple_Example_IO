package Task24;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(".\\Task24\\24_demo.txt"));

        char prev = (char) in.read();
        int count = 0;
        int max = 0;

        while (in.ready()) {
            char cur = (char) in.read();

            if (cur != prev) {
                count++;
            } else {

                if (count > max) {
                    max = count;
                }

                count = 1;
            }

            prev = cur;
        }

        if (count > max) {
            max = count;
        }

        System.out.println(max);

    }
}
