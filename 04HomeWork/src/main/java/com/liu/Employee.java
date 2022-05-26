package com.liu;

/**
 * @program: GenericParadigm
 * @description:
 * @author: 刘帅彪
 * @create: 2022-05-24 17:20
 **/


public class Employee {
    private String name;
    private int sal;
    private MyDate date;

    public Employee(String name, int sal, MyDate date) {
        this.name = name;
        this.sal = sal;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public MyDate getDate() {
        return date;
    }

    public void setDate(MyDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "\nEmployee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", date=" + date +
                '}';
    }
}
