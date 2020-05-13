import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Task3 {
    public static void main(String[] args) {

        try {
            byte[] file1 = Files.readAllBytes(Paths.get("E:\\JJava\\Учеба\\Project12\\src\\File2.txt"));
            byte[] file2 = Files.readAllBytes(Paths.get("E:\\JJava\\Учеба\\Project12\\src\\File1.txt"));

            int max = file1.length < file2.length ? file1.length : file2.length;
            for (int i = 0; i < max; i++) {
                if (file1[i] != file2[i]) {
                    System.out.println((char) file1[i] + " != " + (char) file2[i]);
                } else {
                    System.out.println((char) file1[i] + " == " + (char) file2[i]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}