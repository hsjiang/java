/**
 * Created by riven_chris on 15/12/21.
 */
public class EnumClass {

    public static void main(String[] args) {

        Enum m;

        for (Shrubbery shrubbery : Shrubbery.values()) {
            System.out.print(shrubbery + " ordinal: " + shrubbery.ordinal() + " ");
            System.out.print("superclass: " + shrubbery.getClass().getSuperclass());
            System.out.println();
        }
        String description = Shrubbery.CRAWLING.getDescription();
        System.out.println(description);
        System.out.println("" + Shrubbery.CRAWLING);
    }
}

enum Shrubbery {
    GROUND("ground"),
    CRAWLING("crawling"),
    HANGING("hanging");

    private String description = null;

    Shrubbery(String str) {
        this.description = str;
    }

    public String getDescription() {
        return description;
    }

    public String toString() {
        return "1212121";
    }
}
