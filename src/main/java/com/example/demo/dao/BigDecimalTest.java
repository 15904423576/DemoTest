package com.example.demo.dao;

import java.util.Arrays;
import java.util.List;

public class BigDecimalTest {

    public static void main(String[] args) {


       /* BigDecimal b = BigDecimal.valueOf(8.34);
        BigDecimal c = BigDecimal.valueOf(3);
        BigDecimal a = BigDecimal.valueOf(3);
        System.out.println(b.setScale(1, BigDecimal.ROUND_HALF_DOWN));
        System.out.println(b.setScale(1, BigDecimal.ROUND_HALF_UP));*/
//        System.out.println(c.setScale(0,BigDecimal.ROUND_HALF_DOWN));
//        System.out.println(c.setScale(0,BigDecimal.ROUND_HALF_UP));
        //System.out.println(b.divide(c,0,));


       /* List<String> lsit = new ArrayList<>();
        System.out.println(lsit);
        System.out.println("aaaaaaaaaa");


        BigDecimal b1 = new BigDecimal("0.03");
        System.out.println(b.multiply(new BigDecimal("0.2")).add(new BigDecimal("0.12")));


        LocalDateTime l = LocalDateTime.now();
        long until = l.until(l.plusHours(1), ChronoUnit.SECONDS);
        long until1 = l.until(l.plusHours(1), ChronoUnit.SECONDS);
        System.out.println(until);
        List<String> lists = new ArrayList<String>();
*/


//        BigDecimal b = new BigDecimal("-1");
//        int i = b.compareTo(BigDecimal.ZERO);
//        System.out.println(BigDecimal.ZERO.doubleValue());
//
//        BigDecimal aa = new BigDecimal("-100");
//        BigDecimal bb = new BigDecimal("0");
//        BigDecimal cc = new BigDecimal("100");
//        System.out.println(aa.compareTo(BigDecimal.ZERO));
//        System.out.println(bb.compareTo(BigDecimal.ZERO));
//        System.out.println(cc.compareTo(BigDecimal.ZERO));

        // System.out.println(new BigDecimal("300.009"));
       /* int a = 1;
        int b;
        System.out.println(a);
        if (true) {
            a = 2;
            b = 3;
        }
        System.out.println(a);
        System.out.println(b);
*/
//        String ss = "ni";
//        Optional<String> s = Optional.of(ss);
//
//       // s.ifPresent();
//
//        List<String> list =new  ArrayList<>();
//        list.add("n");
//        list.add("y");
//        list.add("h");
//        list.add("h");
//        list.forEach(System.out::println);

        Arrays.asList("1","2");
        String[] s = {"3","4"};
        // List<String> list = new ArrayList(s);
        List<String> list = Arrays.asList("1","2");
        for (String s1 : list) {
            System.out.println(s1);
        }
      System.out.println("----------------");
        list.forEach(ss->System.out.println(ss));

        new Thread(()->System.out.println("33")).start();

    }



    }


















