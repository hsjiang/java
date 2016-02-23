/**
 * Created by riven_chris on 15/6/11.
 */
public class ClassObject {

    public static void main(String[] args) throws ClassNotFoundException {

        System.out.println("inside main");

//        new Candy();
//        Class candy = Candy.class;//不能导致初始化
//        Candy candy;//不能导致初始化
        Class candy = Class.forName("Candy");

        System.out.println("After creating Candy");

        try {
            Class c = Class.forName("package1.Toy1$InnerToy");
//            Class c = Class.forName("Gum");
            System.out.println(c.getName());
            System.out.println(c.getSimpleName());
            System.out.println(c.getCanonicalName());
            Object obj = c.newInstance();
            System.out.println(obj.getClass());
        } catch (ClassNotFoundException e) {
            System.out.println("Couldn't find Gum");
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        System.out.println("After Class.forName(\"Gum\")");

        new Cookie();

        System.out.println("After creating Cookie");

    }

}

class Candy {
    static {
        System.out.println("Loading Candy");
    }
}

class Gum {
    static {
        System.out.println("Loading Gum");
    }
}

class Cookie {
    static {
        System.out.println("Loading Cookie");
    }
}