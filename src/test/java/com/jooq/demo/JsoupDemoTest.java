package com.jooq.demo;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Test;

import java.io.IOException;

/**
 * @author ellien
 * @package com.jooq.demo
 * @date 2017/12/01 10:06
 */
public class JsoupDemoTest {

    @Test
    public void test(){
        try {
           // Jsoup.parse()
            Document doc = Jsoup.connect("https://search.jd.com/Search?keyword=iphonex&enc=utf-8&suggest=1.def.0.V17&wq=iphone&pvid=142a93839b9d47738b98e940ed0244df").get();

            doc.title();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
