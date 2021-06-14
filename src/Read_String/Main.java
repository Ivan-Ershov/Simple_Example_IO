package Read_String;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File(".\\Read_String\\input.txt"));
        System.setOut(new PrintStream(".\\Read_String\\output.txt"));

        //Считывает строку из файла
        String string = in.nextLine();

        //Пишем строку в файл
        System.out.println(string);

        //Считываем строку до пробела
        string = in.next();

        //Пишем строку в файл
        System.out.println(string);

    }
}
