import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

/**
 * Created by riven_chris on 15/6/26.
 */
public class ShowMethods {

    public class InnerClass {
        public InnerClass(){

        }

        public InnerClass(Integer i){

        }
    }

    private static String usage = "usage:\n"
            + "ShowMethods qualified.class.name word\n"
            + "To show all methods in class or:\n"
            + "ShowMethods qualified.class.name word\n"
            + "To search for methods involving 'word'";

    private static Pattern p = Pattern.compile("\\w+\\.|native|final");

    public static void main(String[] args) {

        try {
            Class<?> c = Class.forName("ShowMethods");
            Method[] methods = c.getMethods();
            Constructor[] constructors = c.getConstructors();

            Class<?> c2 = Class.forName("ShowMethods$InnerClass");
            Constructor[] constructors2 = c2.getConstructors();

            for (Method method : methods) {
                System.out.println(p.matcher(method.toString()).replaceAll(""));
//                System.out.println(method.toString());
            }

            for (Constructor constructor : constructors) {
                System.out.println(p.matcher(constructor.toString()).replaceAll(""));
            }

            for (Constructor constructor2 : constructors2) {
                System.out.println(p.matcher(constructor2.toString()).replaceAll(""));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
