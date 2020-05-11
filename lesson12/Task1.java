import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Task1 {

    public static void main(String[] args) {

        File file = new File("testfile.txt");
        try {
            PrintWriter printWriter = new PrintWriter(file);
            printWriter.printf("Skirnevskaya Ekaterina Sergeevna%n");
            printWriter.printf("01 January");
            printWriter.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("Имя файла: " + file.getName());
        System.out.println("Путь: " + file.getPath());
        System.out.println("Полный путь: " + file.getAbsolutePath());
        System.out.println("Родительский каталог: " + file.getParent());
        System.out.println(file.exists() ? "существует" : "не существует");
        System.out.println(file.canWrite() ? "можно записывать" : "нельзя записывать");
        System.out.println(file.canRead() ? "можно читать" : "нельзя читать");
        System.out.println("is " + ("Директория? " + (file.isDirectory() ? "да" : "нет")));
        System.out.println(file.isFile() ? "обычный файл" : "не обычный файл");
        System.out.println("Последняя модификация файла: " + file.lastModified());
        System.out.println("Размер файла: " + file.length() + " Bytes");
    }
}
