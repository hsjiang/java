/**
 * Created by riven_chris on 15/4/28.
 */
public class InterfaceDemo {

    public static void main(String[] args) {
        A a = new A();
//       A.D ad =  a.getD();
        A.DImpl2 di2 = (A.DImpl2) a.getD();
    }

}

class A {
    private interface D {
        void f();
    }

    private class DImpl implements D {
        @Override
        public void f() {

        }
    }

    public class DImpl2 implements D {
        @Override
        public void f() {

        }
    }

    public D getD() {
        return new DImpl2();
    }

    private D dRef;

    public void receiveD(D d) {
        dRef = d;
        dRef.f();
    }
}
