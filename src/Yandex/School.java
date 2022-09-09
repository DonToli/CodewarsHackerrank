package Yandex;

import java.util.Scanner;

public class School {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] string_array = string.split("\\p{javaSpaceChar}{1,}");
        int n = Integer.parseInt(string_array[0]);//считывает и записывает в n количество учеников
        string = scanner.nextLine();
        string_array = string.split("\\p{javaSpaceChar}{1,}");// считывает координаты домов учеников
        int[] house = new int[n]; //создание массива(домов) по колличеству учеников
        for (int i = 0; i < n; i++){   //заполнение массива(для получения индекса
            house[i] = Integer.parseInt(string_array[i]);
        }
        int ans = (int)Math.ceil(n/2); //вычисление индекса центрального дома
        System.out.println(house[ans]);
        scanner.close();
    }
}

