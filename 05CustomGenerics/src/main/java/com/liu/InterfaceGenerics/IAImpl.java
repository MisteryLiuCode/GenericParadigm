package com.liu.InterfaceGenerics;

/**
 * @program: GenericParadigm
 * @description: 接口实现
 * @author: 刘帅彪
 * @create: 2022-05-26 14:38
 **/


public interface IAImpl extends IA<String, Integer>{

}
class B implements IAImpl{

//    通过继承的接口实现的方法也会指定参数类型
    @Override
    public String method(Integer integer) {
        return null;
    }
}
