import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Task7 {
    public static void main(String[] args) throws IOException {
        Document document = Jsoup.connect("https://www.dns-shop.ru/catalog/17a8a01d16404e77/smartfony/?order=1&groupBy=none&brand=apple&f[pqc]=kdf7y-o8r3o&stock=2").get();
        Elements elementsLinks = document.select("a[class=ui-link]");
        ArrayList<String> urls = new ArrayList<>();
        ArrayList<String> urls2 = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (Element elements : elementsLinks) {
            urls.add(elements.attr("href"));
        }
        for (int i = 0; i < urls.size(); i++) {
            if (urls.get(i).startsWith("/product/")) {
                urls2.add("https://www.dns-shop.ru" + urls.get(i));
            }
        }
        for (int i = 0; i < urls2.size(); i++) {
            // System.out.println(urls2.get(i));
            Connection document1 = Jsoup.connect(urls2.get(i));
            String name = document1.get().select("h1[class=page-title price-item-title]").text();
            String price = document1.get().select("div[class=hidden-xs hidden-sm price-block-wrap price-block-wrap_view_desktop] span[class=current-price-value]").text();

            //   System.out.println(name + " " + price);
            int priceSmart = Integer.parseInt(price.replaceAll(" ", ""));
            list.add(priceSmart);
            Collections.sort(list);
            for (Integer s : list) {
                System.out.println(name + " " + s);
            }
        }
    }
}