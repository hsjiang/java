package package2;

/**
 * Created by riven_chris on 2016/12/29.
 */
public class StaticFinalFieldClass {

    public static final String superClassName = "StaticFinalFieldClass";

    public static String staticField1 = "staticField1";

    static {
        System.out.println("StaticFinalFieldClass initialing");
    }
}
