import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;

public class Task7 {
    public static void main(String[] args) throws IOException {
        Document document = Jsoup.connect("https://www.dns-shop.ru/catalog/17a8a01d16404e77/smartfony/?order=1&groupBy=none&brand=apple&f[pqc]=kdf7y-o8r3o&stock=2").get();
        Elements elementsLinks = document.select("a[class=ui-link]");
        ArrayList<String> urls = new ArrayList<>();
        ArrayList<String> urls2 = new ArrayList<>();
        for (Element elements : elementsLinks) {
            urls.add(elements.attr("href"));
        }
        for (int i = 0; i < urls.size(); i++) {
            if (urls.get(i).startsWith("/product/")) {
                urls2.add("https://www.dns-shop.ru" + urls.get(i));
            }
        }
        for (int i = 0; i < urls2.size(); i++) {
            //  System.out.println(urls2.get(i));
            Document document1 = (Document) Jsoup.connect(urls.get(i));
            String name = document1.select("h1[class=page-title price-item-title]").text();
            String price = document1.select("span[class=current-price-value]").text();
            System.out.println(name + " " + price);
        }
    }
}