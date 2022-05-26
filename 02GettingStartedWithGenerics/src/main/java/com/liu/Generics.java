package com.liu;

/**
 * @program: GenericParadigm
 * @description: 泛型演示
 * @author: 刘帅彪
 * @create: 2022-05-24 15:45
 **/


public class Generics<E> {
    private E name;

    public Generics(E name) {
        this.name = name;
    }

    public void show(){
//        查看这个属性的数据类型
        System.out.println("name的值是"+name+"name的类型是"+name.getClass());
    }
}
