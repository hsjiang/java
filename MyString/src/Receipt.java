import java.util.Calendar;
import java.util.Formatter;

/**
 * Created by riven_chris on 15/5/26.
 */
public class Receipt {
    private double total = 0;
    private Formatter f = new Formatter(System.out);

    public void printTitle() {
        f.format("%-15s %5s %10s \n", "Item", "Qty", "Price");
        f.format("%-15s %5s %10s \n", "----", "---", "-----");

//        f.format("%15s %5s %10s \n", "Item", "Qty", "Price");
//        f.format("%15s %5s %10s \n", "----", "---", "-----");
    }

    public void print(String name, int qty, double price) {
        f.format("%-15.15s %5d %10.2f \n", name, qty, price);
        total += price;
    }

    public void printTotal() {
        f.format("%-15s %5s %10.2f \n", "Tax", "", total * 0.06);
        f.format("%-15s %5s %10s \n", "", "", "-----");
        f.format("%-15s %5s %10.2f \n", "Total", "", total * 1.06);

        f.format("%015x %5s %10.2f \n", 111, "", total * 1.06);
    }

    public static void main(String[] args) {
//        Receipt receipt = new Receipt();
//        receipt.printTitle();
//        receipt.print("Jack's Magic Beans", 4, 4.25);
//        receipt.print("Princess Peas", 3, 5.1);
//        receipt.print("Three Bears Porridge", 1, 14.29);
//        receipt.printTotal();

//        Calendar c = Calendar.getInstance();
//        String s1 = String.format("今天是：%1$tY年%1$tm月%1$te日", c);
//        String s2 = String.format("今天是：%1$tY年%<tm月%<te日", c);
//        System.out.println(s1);
//        System.out.println(s2);

        Formatter formatter = new Formatter();
        System.out.println(formatter.format("%2$s %s %3$s %s", "a", "b", "c", "d"));
    }
}
