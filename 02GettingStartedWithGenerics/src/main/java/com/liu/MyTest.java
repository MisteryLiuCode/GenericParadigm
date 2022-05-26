package com.liu;

public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        Generics<String> test = new Generics<>("测试String类型");
        test.show();
        Generics<Integer> test2 = new Generics<Integer>(2);
        test2.show();
    }
}
