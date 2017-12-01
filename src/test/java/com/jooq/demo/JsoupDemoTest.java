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
            Document doc = Jsoup.connect("http://www.oschina.net/").get();
            doc.title();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
