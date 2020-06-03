import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import sun.rmi.runtime.Log;

import java.io.IOException;

public class Task7 {
    public static void main(String[] args) throws IOException {
        Document document = Jsoup.connect("https://www.dns-shop.ru/catalog/17a8a01d16404e77/smartfony/?order=1&groupBy=none&brand=apple&f[pqc]=kdf7y-o8r3o&stock=2").get();
        //   Elements elementsName = document.select("div[class=product-info__title-link]");
        Elements elementsPrice1 = document.select("div[id=catalog-items-page]");

        Elements elementsPrice2 = elementsPrice1.select("span[class=current-price-value]");

        // for (Element elementName : elementsName) {
        //   String name = elementName.select("div[class=product-info__title-link]").text();


        for (Element element : elementsPrice2) {
            String price2 = element.select("span[class=current-price-value]").text();
            System.out.println(price2);
        }
        //  System.out.println(name + " " + price);

    }

    //          }
}
    //}
//}
