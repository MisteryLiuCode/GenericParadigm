package com.liu;

public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        CustomerGen<String,Integer,Double> customerGen=new CustomerGen<>();
//        因为指定A的类型是String，所以不能指定int
//        customerGen.setA(10);
        customerGen.setB(10);
        System.out.println(customerGen);
//        如果没有指定类型，那么泛型的类型就是object
        CustomerGen customerGen1=new CustomerGen();
//        因为是object类型，那么可以赋任何类型的值
        customerGen1.setA(10);
        customerGen1.setA("test");
        customerGen1.setB(10.0);
        System.out.println(customerGen1);
    }


}
