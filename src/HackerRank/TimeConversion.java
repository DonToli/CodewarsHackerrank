package HackerRank;
import java.io.*;
import java.util.*;

import static java.util.stream.Collectors.joining;

public class TimeConversion {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

    public static String timeConversion(String s) {
        String pmOrAm = s.split(":")[2].substring(2);
        if (pmOrAm.equals("PM")) {
            if (s.substring(0, 2).equals("12")) return s.substring(0,8);
            int hour = Integer.parseInt(s.substring(0, 2));
            hour += 12;
            return Integer.toString(hour) + s.substring(2, 8);
        } else {
            if (s.substring(0, 2).equals("12")) return "00" + s.substring(2, 8);
            return s.substring(0,8);
        }
    }
}
