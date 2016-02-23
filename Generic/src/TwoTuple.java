import java.util.ArrayList;
import java.util.List;

/**
 * Created by riven_chris on 15/7/6.
 */
public class TwoTuple<A, B> {

    public final A first;
    public final B second;

    public TwoTuple(A a, B b) {
        this.first = a;
        this.second = b;
    }

    public A getA() {
        return first;
    }

    public <T> void get(T t) {
        List<T> list = new ArrayList<T>();
        list.add(t);
    }

    @Override
    public String toString() {
        return "(" + first + "," + second + ")";
    }
}
