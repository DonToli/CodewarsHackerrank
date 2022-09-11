package HackerRank;
import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Resul {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */
//Первый Вариант
    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here

        int firstDiagonal = 0;
        int secondDiagonal = 0;

        for (int i = 0; i< arr.size();i++){
            firstDiagonal+=arr.get(i).get(i);
        }
        for (int i = 0; i < arr.size(); i++) {
            secondDiagonal+=arr.get(i).get(arr.size()-(i+1));
        }
        return Math.abs(firstDiagonal-secondDiagonal);
    }

}
/*      Второй Вариант
    public static int diagonalDifference(List<List<Integer>> arr) {
        int diagonal = 0;

        for (int i = 0; i< arr.size();i++){
            diagonal +=arr.get(i).get(i);
            diagonal -=arr.get(i).get(arr.size()-(i+1));
        }

        return Math.abs(diagonal);
   }

}*/

public class DiagonalDifference {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Resul.diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

