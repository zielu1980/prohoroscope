package pl.sda.Marcin;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HoroscopeExcratcor {

    private static final String PATTERN =  "<p class=\"lead\">.+";


    public static String getHoroscopeText(String pageText){
        Pattern horoscopePattern = Pattern.compile(PATTERN);
        Matcher horoscopeMatcher = horoscopePattern.matcher(pageText);
        horoscopeMatcher.find();
        String foundText = horoscopeMatcher.group();
        return foundText;

    }
}
