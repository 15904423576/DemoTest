package com.example.demo.dao;

import org.springframework.beans.BeanUtils;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class DemoTest6 {

    public static void main(String[] args) {
        int a = 3;
        System.out.println("s");
        LocalTime localTimeiem = LocalTime.of(13,44,44);
        localTimeiem.plusHours(3);
        localTimeiem.plusMinutes(22);
        System.out.println(localTimeiem);
        System.out.println("end");
        AA aa = new AA("aa",3);
       //BB bb = new BB("ff", "vv", "dd");
        BB bb = new BB();
        BeanUtils.copyProperties(aa,bb);
        System.out.println(bb.toString());
        System.out.println(aa.toString());



    }
}

class AA{
    private String aa ;

    private int a  ;

    @Override
    public String toString() {
        return "AA{" +
                "aa='" + aa + '\'' +
                ", a=" + a +
                '}';
    }

    public AA(String aa, int a) {
        this.aa = aa;
        this.a = a;
    }

    public String getAa() {
        return aa;
    }

    public void setAa(String aa) {
        this.aa = aa;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}

class BB{

    private String aa ;

    private String a;

    public BB(String aa, String a) {
        this.aa = aa;
        this.a = a;
    }

    @Override
    public String toString() {
        return "BB{" +
                "aa='" + aa + '\'' +
                ", a='" + a + '\'' +
                '}';
    }

    public String getAa() {
        return aa;
    }

    public void setAa(String aa) {
        this.aa = aa;
    }

    public String getA() {
        return a;
    }

    public BB() {
    }

    public void setA(String a) {
        this.a = a;
    }
}
