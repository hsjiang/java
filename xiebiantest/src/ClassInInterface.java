/**
 * Created by riven_chris on 15/5/6.
 */
public interface ClassInInterface {

    void method();

    public static class InnerClass implements ClassInInterface {
        @Override
        public void method() {
            System.out.println("method");
        }

        public static void main(String[] args) {
            new InnerClass().method();
        }
    }
}
