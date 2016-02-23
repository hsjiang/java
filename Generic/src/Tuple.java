import java.util.EnumSet;

/**
 * Created by riven_chris on 15/7/6.
 */
public class Tuple {

    public static <A, B> TwoTuple<A, B> tuple(A a, B b) {
        return new TwoTuple<A, B>(a, b);
    }

    EnumSet es;

}
