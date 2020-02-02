package pl.sda.Marcin;

import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;

import static pl.sda.Marcin.Connector.getPage;

public class App {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj znak zodiaku. Po polsku, małymi literami");
        String userInput = scanner.next();
        String requestResult = Connector.getPage(userInput);
        String horoscopeMessage = "";
        if (!requestResult.equals(Connector.NOT_FOUND)){
            horoscopeMessage = HoroscopeExcratcor.getHoroscopeText(requestResult);

        }
        System.out.println(horoscopeMessage);

    }

    public String getHoroscopeText(String pageAsText){
        Pattern pattern = Pattern.compile("jakiś tekst poprzedzający wystąpienie horoskopu.+");
        return "wwww";


    }
}
