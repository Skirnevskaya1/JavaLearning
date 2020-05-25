import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Task5 {
    public static void main(String[] args) throws IOException {
        Document document = Jsoup.connect("https://yandex.ru/").get();
        Elements elements = document.getAllElements();
     //   Elements elements = document.select("img");
        for (Element element : elements) {
            System.out.println(element);
        }
    }
}


