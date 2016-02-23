package package2;

import package1.A;

/**
 * Created by riven_chris on 15/7/1.
 */
public class HiddenC {
    public static A makeA() {
        return new C();
    }
}

class C implements A {
    @Override
    public void f() {
        System.out.println("public C.f()");
    }

    @Override
    public void g() {
        System.out.println("public C.g()");
    }

    void u() {
        System.out.println("public C.u()");
    }

    protected void v() {
        System.out.println("public C.v()");
    }

    private void w() {
        System.out.println("public C.w()");
    }
}



