import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by riven_chris on 15/6/29.
 */
public class JavaDynamicProxy implements InvocationHandler {

    private Object proxied;

    public JavaDynamicProxy(Object proxied) {
        this.proxied = proxied;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("**** proxy: " + proxy.getClass() + "method: " + method + "args: " + args);
        if (args != null) {
            for (Object arg : args) {
                System.out.println("" + arg);
            }
        }
        return method.invoke(proxied, args);
    }
}

class SimpleDynamicProxy {
    public static void consumer(Interface iFace) {
        iFace.doSomething();
        iFace.doSomethingElse(" bonobo");
    }

    public static void main(String[] args) {
        RealObject realObject = new RealObject();
        consumer(realObject);

        Interface proxy = (Interface) Proxy.newProxyInstance(Interface.class.getClassLoader(),
                new Class[]{Interface.class}, new JavaDynamicProxy(realObject));
        consumer(proxy);
    }
}

interface Interface {
    void doSomething();

    void doSomethingElse(String arg);
}

class RealObject implements Interface {
    @Override
    public void doSomething() {
        System.out.println("doSomething");
    }

    @Override
    public void doSomethingElse(String arg) {
        System.out.println("doSomethingElse" + arg);
    }
}
