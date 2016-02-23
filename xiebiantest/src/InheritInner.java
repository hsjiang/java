/**
 * Created by riven_chris on 15/5/10.
 */
public class InheritInner {

    class In extends WithInner.Inner {

        public In(int i, WithInner inner) {
            inner.super(i);
        }
    }

    public void method() {
        System.out.println("method");
    }

    public static void main(String[] args) {
        WithInner withInner = new WithInner();
    }
}
