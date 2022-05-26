package com.liu;

import java.util.HashMap;

public class MyTest {
    /*
    问题描述在ReadMe
     */
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
//        创建三个对象
        Student student01 = new Student("小红", 22);
        Student student02 = new Student("小强",20);
        Student student03 = new Student("小明",18);
//        创建hashMap放进去
        HashMap<String, Student> map = new HashMap<>();
        map.put(student01.getName(),student01);
        map.put(student02.getName(),student02);
        map.put(student03.getName(),student03);
    }
}
