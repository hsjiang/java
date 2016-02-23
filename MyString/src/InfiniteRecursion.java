import java.util.ArrayList;
import java.util.List;

/**
 * Created by riven_chris on 15/5/25.
 */
public class InfiniteRecursion {
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        List<InfiniteRecursion> list = new ArrayList<InfiniteRecursion>();

        for (int i = 0; i < 10; i++) {
            list.add(new InfiniteRecursion());
        }

        System.out.println(list);
    }
}
