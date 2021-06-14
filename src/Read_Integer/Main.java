package Read_Integer;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File(".\\Read_Integer\\input.txt"));
        System.setOut(new PrintStream(".\\Read_Integer\\output.txt"));

        //Считываем числа из файла (числа написаны через пробел)
        int a = in.nextInt();
        int b = in.nextInt();

        int sum = a + b;

        //Пишем сумму в файл
        System.out.println(sum);

        //Считываем числа из файла (числа написаны каждое на новой строке)
        a = in.nextInt();
        b = in.nextInt();

        sum = a + b;

        //Пишем сумму в файл
        System.out.println(sum);

    }
}
