package com.liu;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: GenericParadigm
 * @description:
 * @author: 刘帅彪
 * @create: 2022-05-24 17:26
 **/

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MyDate implements Comparable<MyDate>{
    private int year;
    private int month;
    private int day;



    @Override
    public int compareTo(MyDate o) {
        //                比较年份
        int i2= year-o.getYear();
        if (i2!=0){
            return i2;
        }
        //                比较月份
        int i3= month-o.getMonth();
        if (i3!=0){
            return i3;
        }
        return day-o.getDay();
    }
}
