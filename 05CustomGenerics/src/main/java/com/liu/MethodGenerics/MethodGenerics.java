package com.liu.MethodGenerics;


/**
 * @program: GenericParadigm
 * @description: 泛型方法
 * @author: 刘帅彪
 * @create: 2022-05-26 14:54
 **/
public class MethodGenerics<T> {
    public static void main(String[] args) {
//        泛型指定类型
        MethodGenerics<String> stringMethodGenerics = new MethodGenerics<>();
//        调用泛型方法
        stringMethodGenerics.genericsMethod(100,"test");
//        调用方法使用了泛型
//        这里类上面指定了只能使用String类型
        stringMethodGenerics.methodGenerics("100");
//        调用泛型方法和方法泛型混合使用
        stringMethodGenerics.generics("test",100);
    }

//   这是泛型方法，也就是方法自己自定义泛型
    public<A,B> void genericsMethod(A a,B b){
        System.out.println("======泛型方法======");
        System.out.println(a.getClass());
        System.out.println(b.getClass());
    }
//    这是方法使用了泛型。
    public void methodGenerics(T  b){
        System.out.println("=======这是方法使用了泛型=======");
        System.out.println(b.getClass());
    }
//    当然方法既可以自定义泛型，也可以使用类的泛型
    public<K> void generics(T t,K k){
        System.out.println("======泛型方法和方法使用了泛型混合使用=======");
        System.out.println(t.getClass());
        System.out.println(k.getClass());
    }
}
