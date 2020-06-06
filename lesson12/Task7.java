import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.Iterator;

public class Task7 {
    public static void main(String[] args) throws IOException {
        Document document = Jsoup.connect("https://www.dns-shop.ru/catalog/17a8a01d16404e77/smartfony/?order=1&groupBy=none&brand=apple&f[pqc]=kdf7y-o8r3o&stock=2").get();
        Elements elementsLinks = document.select("a[class=ui-link]");
        Iterator<Element> iterator = elementsLinks.iterator();
        
        while (iterator.hasNext()) {
            Element element = iterator.next();
            String name = element.select("h1[class=page-title price-item-title]").text();
            String price = element.select("span[class=current-price-value]").text();
            System.out.println(name + " " + price);
        }
    }
}
