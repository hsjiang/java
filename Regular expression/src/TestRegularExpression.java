import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by riven_chris on 15/6/4.
 */
public class TestRegularExpression {

    public static void print(String args) {
        System.out.println(args);
    }

    public static void main(String[] args) {

        args = new String[]{"abcabcabcedfabc", "abc+", "(abc)+", "(abc){2,}"};
        print("Input: \"" + args[0] + "\"");

//        for (String arg : args) {
//            print("Regular expression: \"" + arg + "\"");
//            Pattern p = Pattern.compile(arg);
//            Matcher matcher = p.matcher(args[0]);
//            while (matcher.find()) {
//                print("Matcher \"" + matcher.group() + "\" at position" + matcher.start() + "-" + (matcher.end() - 1));
//            }
//        }

//        String s = "Java now has regular expression";
//        String[] array = new String[]{"^Java", "\\breg.*", "n.w\\s+h(a|i)s", /*"s?", "s+", "s*",*/ "s{4}", "s{1}", "s{0,3}"};
//        for (String reg : array) {
//            print("Regular expression: \"" + reg + "\"");
//            Pattern p = Pattern.compile(reg);
//            Matcher matcher = p.matcher(s);
//            while (matcher.find()) {
//                print("Matcher \"" + matcher.group() + "\" at position " + matcher.start() + "-" + (matcher.end()));
//            }
//        }

//        String s = "aaa fffff 999999999";
        String s = "fffff";
        Pattern pattern = Pattern.compile("(\\w)((?=\\1\\1\\1)(\\1))+");
//        Pattern pattern = Pattern.compile("(f)((?=fff)(f))+");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            print(matcher.group() + " " + matcher.start());
        }
    }
}
