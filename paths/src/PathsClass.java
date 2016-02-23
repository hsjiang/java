import java.nio.file.Path;

/**
 * Created by riven_chris on 15/6/3.
 */
public class PathsClass {

    public static void main(String[] args) {
        PathsClass p = new PathsClass();
        System.out.println(p.getClass().getResource(""));
        System.out.println(p.getClass().getResource("/"));
        System.out.println(p.getClass().getClassLoader().getResource(""));
        System.out.println(p.getClass().getClassLoader().getResource("/"));// null
        System.out.println(p.getClass().getResource("out.xml").getPath());
        System.out.println(p.getClass().getResource("package1/my.xml").getPath());
        System.out.println(p.getClass().getResource("/out.xml").getPath());
        System.out.println(p.getClass().getResource("/package1/my.xml").getPath());
    }
}
