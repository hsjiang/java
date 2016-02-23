/**
 * Created by riven_chris on 15/5/5.
 */
public class InnerTest1 {

    private int filed = 0;

    private void method() {
    }

    private IInterface getInner() {
        return new InnerClass();
    }

    private class InnerClass implements IInterface {

        private void innerMethod() {
            filed = 1;
        }
    }

    public interface IInterface {

    }

}