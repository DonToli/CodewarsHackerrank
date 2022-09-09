package Yandex;

import java.util.Scanner;

public class Data {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] string_array = string.split("\\p{javaSpaceChar}{1,}");
        int x = Integer.parseInt(string_array[0]);
        int y = Integer.parseInt(string_array[1]);
        int z = Integer.parseInt(string_array[2]);

        if (x > 12 || y > 12 || x == y)
            System.out.println(1);
        else
            System.out.println(0);

        scanner.close();
    }
}

