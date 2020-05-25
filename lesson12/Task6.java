import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Task6 {
    public static void main(String[] args) throws IOException {
        Document document1 = Jsoup.connect("https://www.msn.com/").get();
        Document document2 = Jsoup.connect("https://sinoptik.com.ru/").get();
        Elements elements1 = document1.getAllElements();
        Elements elements2 = document2.getAllElements();

        for (Element element1 : elements1) {
            for (Element element2 : elements2) {
                if (element1 != element2) {
                    System.out.println(element1 + " НЕ РАВЕН " + element2);
                } else System.out.println(element1 + " РАВЕН " + element2);
            }
        }
    }
}