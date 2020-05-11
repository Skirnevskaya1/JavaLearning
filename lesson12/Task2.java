import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Task2 {

    public static void main(String[] args) {
        try {
            File file = new File("testfile.txt");
            PrintWriter printWriter = new PrintWriter(new FileWriter(file));
            printWriter.printf("%d%n", 255);
            printWriter.printf("%o%n", 255);
            printWriter.printf("%x", 255);
            printWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
