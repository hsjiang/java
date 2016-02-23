package package1;

/**
 * Created by riven_chris on 15/6/3.
 */
public class InnerPathsClass {
    public static void main(String[] args) {
        InnerPathsClass p = new InnerPathsClass();
        System.out.println(p.getClass().getResource(""));
        System.out.println(p.getClass().getResource("/"));
        System.out.println(p.getClass().getClassLoader().getResource(""));
        System.out.println(p.getClass().getClassLoader().getResource("/"));// null
        System.out.println(p.getClass().getResource("/out.xml").getPath());
        System.out.println(p.getClass().getResource("/package1/my.xml").getPath());
        System.out.println(p.getClass().getResource("/package2/in.xml").getPath());
        System.out.println(p.getClass().getClassLoader().getResource("package2/in.xml").getPath());
//        System.out.println(p.getClass().getResource("/out.xml").getPath());
//        System.out.println(p.getClass().getResource("/package1/my.xml").getPath());
    }
}
