import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test {
//reverse текст,сначала написать потом перевернуть
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String text = bufferedReader.readLine();

        String reverse = new StringBuilder(text).reverse().toString();

        System.out.println(reverse);
    }


}
