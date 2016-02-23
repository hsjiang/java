import java.util.Arrays;
import java.util.Locale;

/**
 * Created by riven_chris on 15/5/25.
 */
public class MyString {
    public static void main(String[] args) {

//        upCase();
        IEquals();
    }

    public static void upCase() {
        String q = "how are you";
        System.out.println(q);
        String qq = q.toUpperCase();
        System.out.println(qq);
        System.out.println(q);

        byte[] bytes = q.getBytes();
        int i = q.length();
        char[] chars = new char[i];
        q.getChars(0, i, chars, 0);
//        System.out.println(chars);

        System.out.println("1".compareTo("a"));
    }

    public static void IEquals() {
        String s1 = "";
        String s2 = new String("");
        System.out.println(s1.equals(s2));
        System.out.println(s1.contentEquals(s2));
        s1.indexOf("");

        s1.concat("dfsf");

        String.valueOf("");

        s1.intern();
    }
}
