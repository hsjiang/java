import java.util.ArrayList;
import java.util.List;

/**
 * Created by riven_chris on 15/7/6.
 */
public class TupleTest2 {

    static TwoTuple<String, Integer> f() {
        return Tuple.tuple("hi", 47);
    }

    static TwoTuple f2() {
        return Tuple.tuple("hi", 47);
    }

    public static void main(String[] args) {
        System.out.println(f());
        System.out.println(f2());
        TwoTuple<String, Integer> f2 = f2();
        System.out.println(f2.first);

        List<Integer> list = new ArrayList<Integer>();
        list.add(1);

        List<? extends Tuple> list2 = new ArrayList<Tuple>();
        list2.add(null);
    }
}
