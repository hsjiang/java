/**
 * Created by riven_chris on 15/7/13.
 * 模板方法
 */
public class GenericTemplate {
    public static void main(String[] args) {
        Creator c = new Creator();
        c.f();
    }
}

abstract class GenericWithCreate<T> {
    final T element;

    GenericWithCreate() {
        element = create();
    }

    abstract T create();
}

class X {
}

class Creator extends GenericWithCreate<X> {
    @Override
    X create() {
        return new X();
    }

    void f() {
        System.out.println(element.getClass().getSimpleName());
    }
}
