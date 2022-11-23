package TinkFest;

import java.util.Scanner;

public class Mobail {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] string_array = string.split("\\p{javaSpaceChar}{1,}");
        int a = Integer.parseInt(string_array[0]);
        int b = Integer.parseInt(string_array[1]);
        int c = Integer.parseInt(string_array[2]);
        int d = Integer.parseInt(string_array[3]);
        int m = d-b;
        int rez=100;
            if (m>0){
                 rez = a+m*c;
            }
        System.out.println(rez);

    }
}
