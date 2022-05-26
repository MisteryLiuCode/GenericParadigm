package com.liu.InterfaceGenerics;

/**
 * @program: GenericParadigm
 * @description: 接口泛型
 * @author: 刘帅彪
 * @create: 2022-05-26 14:33
 **/


public interface IA<A, B> {
    //    属性不能使用泛型
    //    A num;
    A method(B b);
}
