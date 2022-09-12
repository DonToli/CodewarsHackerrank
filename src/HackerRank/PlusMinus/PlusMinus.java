package HackerRank.PlusMinus;
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
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
    int positiveCount = 0;
    int negativeCount = 0;
    int zeroCount = 0;
        for (int n :arr) {
            if (n > 0) {
                positiveCount++;
            } else if (n == 0) {
                zeroCount++;
            }else {
                negativeCount++;
            }
        }
        System.out.println((float) positiveCount/arr.size());
        System.out.println((float) negativeCount/arr.size());
        System.out.println((float) zeroCount/arr.size());

    }

}

public class PlusMinus {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}


