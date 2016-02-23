import package1.Toy1;

import java.lang.reflect.Field;

/**
 * Created by riven_chris on 15/6/12.
 */

interface HasBatteries {
}

interface Waterproof {
}

interface Shoots {
}

interface newInterface {

}

class Toy {
    Toy() {
    }

    Toy(int i) {
    }
}

class FancyToy extends Toy implements HasBatteries, Waterproof, Shoots, newInterface {
    private int i = 0;
    public int m = 0;
    public static int n = 0;

    static{
        System.out.println("FancyToy Initialing");
    }

    FancyToy() {
        super(1);
    }

}

public class ToyTest {
    Toy1 t = null;
    static void printInfo(Class cc) {
        System.out.println("Class name: " + cc.getName() + " is interface?[" + cc.isInterface() + "]");
        System.out.println("Simple name: " + cc.getSimpleName());
        System.out.println("CanonicalName name: " + cc.getCanonicalName());
    }

    static void isPrimitive(Class c) {
        System.out.println("c.isPrimitive(): " + c.isPrimitive());
    }

    public static void main(String[] args) {
        Class c = null;
        System.out.println("FancyToy defined");
        try {
            c = Class.forName("FancyToy");
            c = FancyToy.class;
            Field[] fileds = c.getFields();
            for (Field filed : fileds) {
                System.out.println(filed.getName() + " is accessible: " + filed.isAccessible());
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Can't find FancyToy");
            System.exit(1);
        }

        printInfo(c);

        for (Class face : c.getInterfaces()) {
            printInfo(face);
        }

        Class up = c.getSuperclass();
        Object obj = null;

        try {
            obj = up.newInstance();
        } catch (InstantiationException e) {
            System.out.println("Cannot instantiate");
            System.exit(1);
        } catch (IllegalAccessException e) {
            System.out.println("Cannot access");
            System.exit(1);
        }

        printInfo(obj.getClass());
        System.out.println(obj.getClass());
    }
}
