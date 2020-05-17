import java.io.FileReader;
import java.io.IOException;

public class Task4 {
    public static void main(String[] args) {
        try {
            FileReader file1 = new FileReader("E:\\JJava\\Учеба\\Project12\\src\\File1.txt");
            FileReader file2 = new FileReader("E:\\JJava\\Учеба\\Project12\\src\\File2.txt");
            int f1;
            int f2;
            // Читаем посимвольно пока код считанного символа не станет равным -1
            while ((f1 = file1.read()) != -1 && (f2 = file2.read()) != -1) {
                if ((char) f1 != (char) f2) {
                    System.out.println((char) f1 + " != " + (char) f2);
                } else System.out.println((char) f1 + " == " + (char) f2);
            }
            file1.close();
            file2.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
