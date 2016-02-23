import java.lang.reflect.Method;

/**
 * Created by riven_chris on 15/8/24.
 */
public class ShowMethods {

    public static void main(String[] args) throws Exception {
        Class<MethodClass> c = MethodClass.class;
        Object o = c.newInstance();
        Method[] methods = c.getMethods();
        for (Method method : methods) {
//            System.out.println(method.getName());
        }

//        Method method = c.getMethod("method", String.class, int.class);
//        method.invoke(o, "String", 1);
        Method method = c.getMethod("method", int.class, String.class);
        method.invoke(o, 1, "String");


        SubMethodClass sub = new SubMethodClass();
//        SubMethodClass.staticMethod();
//        sub.finalMethod(1);
//        SubMethodClass.i = 9;
    }
}


class MethodClass {

    public static int i = 1;

    public void method(int i, String s) {
        System.out.println(" call method1 args: " + i + ", " + s);
    }

    public void method(String s, int i) {
        System.out.println(" call method2 args: " + s + ", " + i);
    }

    public static void staticMethod() {
        //不能被覆盖
    }

    public final void finalMethod(int i) {
        //不能被覆盖
    }
}

class SubMethodClass extends MethodClass {

    private Class1 c1 = new Class1();

    //    @Override//不能被覆盖
    public static void staticMethod() {
    }

    @Override
    public void method(int i, String s) {
        super.method(i, s);
        Class2 c2 = new Class2();
    }
}

class Class1 {
    static {
        System.out.println("initial Class1");
    }
}

class Class2 {
    static {
        System.out.println("initial Class2");
    }
}