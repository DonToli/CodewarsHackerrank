package HackerRank.Pangrams;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'pangrams' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String pangrams(String s) {
        // Write your code here
        String replace = s.replaceAll(" ",""); //замена символов
        String lowerCase = replace.toLowerCase();  // привидение к одному регистру
        TreeSet<Character> alf = new TreeSet<>();  // класс для сортировки в возрастающем порядке
        for (int i = 0;i<lowerCase.length();i++){  //заполнение
            alf.add(lowerCase.charAt(i));
        }
        if (alf.size()==26){
            return "pangram";
        }else {
            return "not pangram";
        }
    }

}

public class Pangrams {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.pangrams(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

