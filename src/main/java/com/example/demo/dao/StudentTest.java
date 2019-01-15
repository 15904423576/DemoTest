package com.example.demo.dao;

public class StudentTest {
    private String name;
    private int age;
    private String mag;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMag() {
        return mag;
    }

    public void setMag(String mag) {
        this.mag = mag;
    }

    public StudentTest() {
    }

    public StudentTest(String name, int age, String mag) {
        this.name = name;
        this.age = age;
        this.mag = mag;
    }
}
