import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by User on 23.11.2019.
 */
public class Addition {
    public static void main(String args[]) throws IOException {
    /*
    Использую BufferedReader т.к. размер буфера по умолчанию больше у него и на сколько слышала,
     предпочтительней работать с  BufferedReader ,если работать с большими массивами данных в потоках,
     вот я и использую его везде
     */
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Integer a = Integer.parseInt(bufferedReader.readLine());
        Integer b = Integer.parseInt(bufferedReader.readLine());
        System.out.println(a + b);
    }
}