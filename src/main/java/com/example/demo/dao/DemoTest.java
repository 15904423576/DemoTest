package com.example.demo.dao;


import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Consumer;

public class DemoTest {

    @Test
    public void method(){
//        top

        method1((a)->System.out.println(a),2);

        method1((a)->System.out.println(a*a),2);

        method1(System.out::println,2);

    }

    public void method1(ddd d,int a){
        d.method1(a);
    }

    @Test
    public void method2(){
        int i = Runtime.getRuntime().availableProcessors();
        System.out.println(i);



    }


    @Test
    public void method6(){



    }







    @Test
    public  void reduce3th() {
        List<Integer> lists = new ArrayList<>();
        lists.add(1);
        lists.add(2);
        lists.add(3);

        Integer product = lists.parallelStream().reduce(1, (a, b) -> a *  (b * 2),
                (a, b) -> a * b);
        System.out.println("product:" + product);//48
    }


    @Test
    public void test1(){

        Consumer<String> con = (s)->System.out.println(s);
        test2("xiao",con);


    }

    @Test
    public void methodd(){
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            final int index = i;


            cachedThreadPool.execute(new Runnable() {

                @Override
                public void run() {
                    System.out.println(index);
                    try {
                        Thread.sleep(  1000);
                    }
                    catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread());
                }
            });
        }
    }



    public void test2(String s ,Consumer<String> con){

        con.accept(s);

    }



}

interface ddd{

    void  method1(int a);


}
