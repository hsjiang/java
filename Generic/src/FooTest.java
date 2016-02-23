import java.lang.reflect.Array;

/**
 * Created by riven_chris on 15/7/8.
 */
public class FooTest {

    public static void main(String[] args) {
        Foo<Integer> f = new Foo<Integer>();
        f.var = 1;
        System.out.println(f.var.getClass().getSimpleName());
    }

}

class Foo<T> {
    T var;
}
