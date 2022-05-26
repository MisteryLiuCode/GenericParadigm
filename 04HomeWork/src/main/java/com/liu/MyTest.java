package com.liu;

import java.util.ArrayList;
import java.util.Comparator;

public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("01",2000,new MyDate(1998,1,7)));
        employees.add(new Employee("01",2000,new MyDate(1998,2,8)));
        employees.add(new Employee("01",2000,new MyDate(1998,1,9)));
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
//                先对name进行排序，如果name相同，则按照生日日期的先后顺序排序
//                对传入的参数进行验证
                if (!(emp1 instanceof Employee && emp2 instanceof Employee)){
                    System.out.println("类型不正确");
                    return 0;
                }
//                比较name
                int i = emp1.getName().compareTo(emp2.getName());
//                如果i!=0就代表有结果了,无需再比较了
                if (i!=0){
                    return i;
                }
//                比较薪水
                int sal=emp1.getSal()-emp2.getSal();
                if (sal!=0){
                    return sal;
                }
////                比较年份
//                int i2= emp1.getDate().getYear()-emp2.getDate().getYear();
//                if (i2!=0){
//                    return i2;
//                }
////                比较月份
//                int i3= emp1.getDate().getMonth()-emp2.getDate().getMonth();
//                if (i3!=0){
//                    return i3;
//                }
//                比较天
                return emp1.getDate().compareTo(emp2.getDate());
            }
        });
        System.out.println("排序后");
        System.out.println(employees);

    }


}
