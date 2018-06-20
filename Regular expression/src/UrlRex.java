import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by riven_chris on 2017/12/12.
 */
public class UrlRex {

    public static String url = "https://www.jetbrains.com/idea/download/previous.html";

    public static void main(String[] args) {
        String hostRex = "";
        String urlRex = "[^/]*/[^/]*";
        Pattern pattern = Pattern.compile(urlRex);
        Matcher matcher = pattern.matcher(url);
        while (matcher.find()) {
            System.out.format("s: %s \n", matcher.group());
        }
//        String[] array = url.split(urlRex);
//        for (String s : array) {
//            System.out.format("s: %s \n", s);
//        }
    }
}
