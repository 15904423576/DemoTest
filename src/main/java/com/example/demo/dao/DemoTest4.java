package com.example.demo.dao;

import java.util.UUID;

public class DemoTest4 {
    public static void main(String[] args) {

System.out.println(UUID.randomUUID().toString().replaceAll("-", ""));
        String s = UUID.randomUUID().toString().replaceAll("-", "");

        System.out.println(s);
    }

}
