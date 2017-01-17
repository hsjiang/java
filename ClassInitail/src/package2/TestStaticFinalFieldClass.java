package package2;

/**
 * Created by riven_chris on 2016/12/29.
 */
public class TestStaticFinalFieldClass {

    public static void main(String[] args) {
        //调用一个类的常量不会引起该类的初始化
        System.out.println(StaticFinalFieldClass.superClassName);
        System.out.println(SubStaticFinalFieldClass.superClassName);

        //调用父类的静态域只会引起父类的初始化
        System.out.println(SubStaticFinalFieldClass.staticField1);
    }
}
