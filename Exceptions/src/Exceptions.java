/**
 * Created by riven_chris on 15/5/23.
 */
public class Exceptions {

    public static void f() throws MyException {
        System.out.println("form f()");

        throw new MyException();
    }

    public static void g() throws MyException {
        System.out.println("form g()");

        throw new MyException("Originated in g()");
    }

    public static void throwG() throws MyException {
        try {
            g();
        } finally {
            System.out.println("finally");
        }
    }


    public static void main(String[] args) {
        try {
            f();
        } catch (MyException e) {

        } finally {
            System.out.println("finally");
        }

//        try {
//            throwG();
//        } catch (MyException e) {
//            e.printStackTrace();
//            System.out.println("catch MyException");
//        }

        try {
            try {
                f();
            } finally {
                g();
//                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println(e);
        }


        //finally中返回，是异常丢失
        try {
            throw new RuntimeException();
        } finally {
            //Using 'return' inside the finally block
            //will silence any thrown exception
            return;
        }
    }
}

class MyException extends Exception {

    private static final long serialVersionUID = 3461899582505930473L;

    public MyException() {
        super();
    }

    public MyException(String args) {
        super(args);
    }
}

class TwoException extends Exception {
    public TwoException() {
        super();
    }
}

