import java.util.Formatter;
import java.util.Locale;

/**
 * Created by riven_chris on 15/5/26.
 */
public class SimpleFormat {

    public static void main(String[] args) {
        int x = 5;
        double y = 5.123213;

//        System.out.format("format %d->%f \n", x, y);
//
//        System.out.printf("format %d->%.3f%%", x, y);
        Formatter formatter = new Formatter(System.out);
        formatter.format("%.2f", y);
    }
}
