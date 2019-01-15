package com.example.demo.dao;

import java.time.LocalTime;
import java.util.*;

public class DemoTest2 {

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(new Date(),"小明"));
        Date date = new Date();
        date.setHours(8);
        list.add(new Student(date,"aa"));
        Date date1 = new Date();
        date.setHours(9);
        list.add(new Student(date1,"aa"));

        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int a = 1;
                Date date1 = o1.getDate();
                Date date2 = o2.getDate();
                if(date1.getTime()>date2.getTime()){
                    a=0;
                }
                LocalTime.now();
                return a;
            }
        });
    }
}

class Student{
    private Date date;
    private String name;

    public Student(Date date, String name) {
        this.date = date;
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "student{" +
                "date=" + date +
                ", name='" + name + '\'' +
                '}';
    }
}
