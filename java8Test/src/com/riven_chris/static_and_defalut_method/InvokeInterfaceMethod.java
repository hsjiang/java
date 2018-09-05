package com.riven_chris.static_and_defalut_method;

public class InvokeInterfaceMethod {

    public static void main(String[] args){
        Model.function1();

        MyMode mode = new MyMode();
        mode.function2();
    }

    public static class MyMode implements Model<String>{

        @Override
        public String get() {
            return null;
        }
    }
}
