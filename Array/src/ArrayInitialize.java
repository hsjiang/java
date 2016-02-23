import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by riven_chris on 15/7/14.
 */
public class ArrayInitialize {
    public static void main(String[] args) {
        String[] array1;
        String[] array2 = new String[1];
        String[] array3 = {"a", "b"}; //聚集初始化
        String[] array4 = new String[]{"a", "b"};//动态聚集初始化

        String[][][] a1 = new String[2][][];
        String[][] a2 = {{"a"}, {"b"}};
        String[][][] a3 = new String[][][]{{{"a"}}, {{"a"}, {"b"}}};


        String[][] a4 = new String[3][]; //第二维数组默认长度为第一位数组长度
//        String[][] a4 = new String[3][4];
        for (int i = 0; i < a4.length; i++) {
            a4[i] = new String[3];

            for (int j = 0; j < a4[i].length; j++) {
                a4[i][j] = String.valueOf(i * j);
            }
        }

        int[] array5 = {1, 2, 3};
        char[] array6 = new char[4];
        System.out.println();
        System.out.println(Arrays.deepToString(a4));


        //数组与泛型
//        List<String>[] lists = new List<String>[1];// Illegal
        List<String>[] ls;
        List[] la = new List[5];
        ls = (List<String>[]) la;
        ls[0] = new ArrayList<String>();


    }
}
