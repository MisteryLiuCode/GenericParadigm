package com.liu.InterfaceGenerics;

public class MyTest implements IA<String,Integer>{
    //    可以看到上面指定接口中泛型的类型后，实现方法就会自动把类型赋值上
    @Override
    public String method(Integer integer) {
        return null;
    }
}
