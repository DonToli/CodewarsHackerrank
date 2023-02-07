package HackerRank.stdOut;

import java.util.Scanner;

public class StdOut {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int i = scanner.nextInt();
        double d = scanner.nextDouble();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Integer: " + i);

    }
}
