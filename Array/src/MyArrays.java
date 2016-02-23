import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by riven_chris on 15/7/15.
 */
public class MyArrays {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        System.out.println(Arrays.deepToString(list.toArray()));

        Integer[] i1 = {1, 2, 3, 4, 5};
        Integer[] i2 = {5, 6, 7, 8, 9};
        int[] i3 = {5, 6, 7, 8, 9};
        System.arraycopy(i2, 0, i1, 2, 2);
//        System.arraycopy(i2, 0, i1, 2, 4); //ArrayIndexOutOfBoundsException
//        System.arraycopy(i3, 0, i1, 2, 2); //ArrayStoreException  不支持自动包装与拆包
        System.out.println(Arrays.deepToString(i1));

        /** 数组的比较 **/
        String[] s7 = new String[4];
        Arrays.fill(s7, "hi");
        String[] s8 = {new String("hi"), new String("hi"), new String("hi"), new String("hi")};
        System.out.println(Arrays.equals(s7, s8));//true 数组相等是基于类容的

        String[] s1 = new String[]{"a", "b"};
        String[] s2 = new String[]{"a", "b"};
        String[] s3 = {"a", "b"};
        String[] s4 = {"a", "b"};
        String[][] s5 = {{"a", "b"}};
        String[][] s6 = {{"a", "b"}};
        System.out.println(s1.equals(s2));//false
        System.out.println(s3.equals(s4));//false
        System.out.println(Arrays.equals(s1, s2));//true
        System.out.println(Arrays.equals(s3, s4));//true
        System.out.println(Arrays.equals(s5, s6));//false
        System.out.println(Arrays.deepEquals(s5, s6));//true

        /** 数组元素的比较 **/
        String[] s9 = {"a", "c", "b", "d"};
        Arrays.sort(s9);
        Arrays.sort(s9, Collections.reverseOrder());
        Arrays.sort(s9, String.CASE_INSENSITIVE_ORDER);
        int index = Arrays.binarySearch(s9, "b");
        System.out.println(index);

        int i = 1;
        System.out.println(~i);
    }
}
