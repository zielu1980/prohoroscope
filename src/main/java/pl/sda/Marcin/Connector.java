package pl.sda.Marcin;

import org.jsoup.Jsoup;
import java.io.IOException;
public class Connector {
    public static final String NOT_FOUND = "NOT_FOUND";
    private static String URL_TEMPLATE = "https://horoskopy.gazeta.pl/horoskop/[placeholder]/dzienny";

    public static String getPage(String zodiacSign) throws IOException {
        String fullurl = URL_TEMPLATE.replace("[placeholder]",zodiacSign);
        String requestResult;
        try {
            requestResult = Jsoup.connect(fullurl).get().html();

        }
        catch (IOException e){
            requestResult = "NOT FOUND";
            e.printStackTrace();
        }
        return requestResult;
    }
}