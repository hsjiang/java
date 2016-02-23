import java.util.ArrayList;
import java.util.List;

/**
 * Created by riven_chris on 15/7/9.
 */
public class ArrayMaker<T> {
    private Class<T> kind; // 类型标签

    public ArrayMaker(Class<T> kind) {
        this.kind = kind;
    }

    List<T> create(int size) {
//        return (T[]) Array.newInstance(kind, size);
        return new ArrayList<T>();
    }

    public <K> List<K> m() {
        return new ArrayList<K>();
    }

    public static void main(String[] args) {
        ArrayMaker<Integer> stringMaker = new ArrayMaker<Integer>(Integer.class);
//        Integer[] stringArray = stringMaker.create(9);
//        System.out.println(Arrays.toString(stringArray));

        List<Integer> list = stringMaker.create(9);
    }

}
