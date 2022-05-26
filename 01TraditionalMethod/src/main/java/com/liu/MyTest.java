package com.liu;
import java.util.ArrayList;
public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        myTest.trandition();
        myTest.generic();

    }
    /*
    传统的方法实现
     */
    public void trandition(){
        ArrayList<Object> list = new ArrayList<>();
        list.add(new Person("小明",18));
        list.add(new Person("小强",20));
        list.add(new Person("小红",22));
//        如果放一个其他的对象就会出现错误
//        list.add(new Person2(" 小亮",25));
        for (Object o : list) {
//            想要获取list中的属性
            Person p=(Person)o;
            System.out.println(p.getName());
        }
    }

//    使用泛型
    public void generic(){
        ArrayList<Person> list = new ArrayList<Person>();
        list.add(new Person("小明",18));
        list.add(new Person("小强",20));
        list.add(new Person("小红",22));
//        如果放一个其他的对象就会直接提示编译错误
//        list.add(new Person2(" 小亮",25));
        for (Person o : list) {
            System.out.println(o.getName());
        }
    }
}
