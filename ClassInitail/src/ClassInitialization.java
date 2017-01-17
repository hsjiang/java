import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by riven_chris on 15/6/15.
 */
public class ClassInitialization {
    public static Random rand = new Random(47);
    final int i = 20;
    final Initable initable = null;

    public static void main(String[] args) {
//        int i = Initable2.staticFinal3;
        Initable i[] = new Initable[]{};                         //定义数组不会引起初始化
//        System.out.println(Initable.staticFinal4);
        Class initable = Initable.class;                         //不会引起类的初始化
//        System.out.println("after creating Initable ref");
//        System.out.println(Initable.staticFinal);
//        System.out.println(Initable.staticFinal1);
//        System.out.println(Initable.staticFinal2);
//        System.out.println(Initable.staticFinal3);
//        System.out.println(Initable.staticFinal4);
//        System.out.println(Initable.staticFinal5);
//        System.out.println(Initable.staticFinal6);

//        System.out.println(Initable2.staticFinal);

        try {
            System.out.println("start test initable3");
            Class initable3 = Class.forName("Initable3");
            System.out.println("obtained initable3.class");
            System.out.println(initable3.getSimpleName());
            System.out.println("after creating Initable ref");
            System.out.println(Initable3.staticFinal);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Collections.unmodifiableList(Arrays.asList());
        Class myClass = ClassInitialization.class;
        myClass.isInstance(myClass);
        myClass.isAssignableFrom(myClass);
    }

    public void method() {
        System.out.println(i);
        System.out.println(initable);
    }
}

class Initable {
    static final int staticFinal = 0;//不会引起初始化
    static final int staticFinal1 = 1;//不会引起初始化
    static final int staticFinal2 = ClassInitialization.rand.nextInt(1000);//会引起初始化
    static int staticFinal3 = 3;//会引起初始化
    static final String staticFinal4 = null;//会引起初始化 null非常量表达式
    static final String staticFinal5 = "5";//不会引起初始化
    static final String staticFinal6 = new String("6");//会引起初始化
    final int final1 = 2;
    final int final2 = new Integer(2);
    int i2 = 3;

    static {
        System.out.println("Initializing Initable");
    }

    void method() {
        final int i;
        if (true) {
            i = 5;
        } else {
            i = 6;
        }
//        i = 7; //Variable "i" might already have been assigned to
        int b = 3 + final1 + i2 + final2;
        System.out.println(b);
    }
}

class Initable2 extends Initable {
    static int staticFinal = 147;

    static {
        System.out.println("Initializing Initable2");
    }
}

class Initable3 {
    static int staticFinal = 74;

    static {
        System.out.println("Initializing Initable3");
    }
}

