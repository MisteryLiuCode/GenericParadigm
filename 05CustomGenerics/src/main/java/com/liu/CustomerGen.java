package com.liu;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: GenericParadigm
 * @description: 自定义泛型
 * @author: 刘帅彪
 * @create: 2022-05-26 11:37
 **/

/*
注意细节：
1、普通类型可以使用泛型
2、使用泛型的数组，不能初始化，（Me）原因可能是类型不确定
3、静态方法不能使用泛型，因为泛型是在类加载的时候确定的类型，而静态是在类加载的时候，静态加载在对象创建的前面
4、泛型的类型是在类创建的时候确定的，在创建类的时候需要指定类的类型
5、如果在创建对象的时候没有指定类型，默认为object
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CustomerGen<A,B,C> {
    A a;
    B b;
    C[] c;
//    数组的泛型不能初始化
//    C[] c=new C[10];
}
