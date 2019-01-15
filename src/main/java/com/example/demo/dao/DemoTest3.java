package com.example.demo.dao;

import java.time.LocalTime;

public class DemoTest3 {
    public static void main(String[] args) {

        String s = "AM";
        demo t = demo.valueOf(s);
        if(demo.AM.equals(t)){
           System.out.println(111);
        }
        System.out.println(t);
        System.out.println(demo.AM.name());


        LocalTime l1 = LocalTime.of(9,9,9);
        LocalTime l2 = LocalTime.of(9,9,40);

                System.out.println( l1.isAfter(l2));


    }

}
enum  demo{
    AM,PM;

}

