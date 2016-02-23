import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by riven_chris on 15/6/3.
 */
public class RegularExpression {

    public static void main(String[] args) {

        String s = "sjo39,20.@%]l}s$f^j/.ow(_@fe ;}";
//        String s = "win 98, win NT, win 2000, win XP, win 7";
//        String s = "done, do, dog";
        System.out.println(Arrays.toString(s.split("]")));
//        System.out.println(Arrays.toString(s.split("win (?=NT|XP)")));
//        System.out.println(Arrays.toString(s.split("win (?!NT|XP)")));

        String s2 = "Let's go go go!";

//        s.split("('|\")(.*?)(\\1)");
//
//        s.split("<(\\w+)\\s*(\\w+(=('|\").*?\\4)?\\s*)*>.*?</\\1>");

        Pattern pattern = Pattern.compile(s, Pattern.MULTILINE);
        Matcher matcher = pattern.matcher(s);
//        matcher.replaceAll();
        matcher.group();
        String s1 = null;
//        s1.replaceAll();
    }

}
