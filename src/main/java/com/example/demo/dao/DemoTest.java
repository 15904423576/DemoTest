package com.example.demo.dao;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;
import java.util.stream.LongStream;

public class DemoTest {
    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    static final Lock lock = new ReentrantLock();
    static final String s = "ss";

    public static void main(String[] args) {
        Runnable r = () ->
        {


            try {
                synchronized (s) {
                    System.out.println("begin wait() ThreadName="
                            + Thread.currentThread().getName());
                    s.wait(2000);
                    String ss = "ssss";
                    //ss.wait(2000);
                    // Thread.sleep(2000);
                    System.out.println("  end wait() ThreadName="
                            + Thread.currentThread().getName());
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            /*lock.lock();
            try {
                System.out.println("得到锁" + Thread.currentThread().getName());
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("执行完成" + Thread.currentThread().getName());*/



            /*} finally {
                lock.unlock();
            }*/

        };

        new Thread(r).start();
        System.out.println("----------xia----------");
        new Thread(r).start();
        System.out.println("----------xia----------");
        new Thread(r).start();
        // mm();
    }

    @Test
    public void method() {
//        top

        method1((a) -> System.out.println(a), 2);

        method1((a) -> System.out.println(a * a), 2);

        method1(System.out::println, 2);

    }

    public void method1(ddd d, int a) {
        d.method1(a);
    }

    @Test
    public void method2() {
        int i = Runtime.getRuntime().availableProcessors();
        System.out.println(i);


    }


    @Test
    public void method6() {


    }


    @Test
    public void reduce3th() {
        List<Integer> lists = new ArrayList<>();
        lists.add(1);
        lists.add(2);
        lists.add(3);

        Integer product = lists.parallelStream().reduce(1, (a, b) -> a * (b * 2),
                (a, b) -> a * b);
        System.out.println("product:" + product);//48
    }


    @Test
    public void test1() {

        Consumer<String> con = (s) -> System.out.println(s);
        test2("xiao", con);


    }

    @Test
    public void methodd() {
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            final int index = i;


            cachedThreadPool.execute(new Runnable() {

                @Override
                public void run() {
                    System.out.println(index);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread());
                }
            });
        }
    }


    public void test2(String s, Consumer<String> con) {

        con.accept(s);

    }

    @Test
    public void mehod() {
        List<Integer> list = Arrays.asList(3, 1, 2, 5, 4, 6, 9, 7, 10, 8);
        int[] ints = list.stream().mapToInt(Integer::intValue).toArray();
        sort(ints, 0, 9);
        System.out.println(Arrays.toString(ints));
    }

    public static void sort(int a[], int low, int hight) {
        int i, j, index;
        if (low > hight) {
            return;
        }
        i = low;
        j = hight;
        index = a[i]; // 用子表的第一个记录做基准
        while (i < j) { // 从表的两端交替向中间扫描
            while (i < j && a[j] >= index)
                j--;
            if (i < j)
                a[i++] = a[j];// 用比基准小的记录替换低位记录
            while (i < j && a[i] < index)
                i++;
            if (i < j) // 用比基准大的记录替换高位记录
                a[j--] = a[i];
        }
        a[i] = index;// 将基准数值替换回 a[i]
        sort(a, low, i - 1); // 对低子表进行递归排序
        sort(a, i + 1, hight); // 对高子表进行递归排序

    }

    @Test
    public void m() {

        /*Instant now = Instant.now();
        System.out.println(now);*/

        long asLong = LongStream.rangeClosed(0, 4).parallel()
                .reduce(Long::sum).getAsLong();

        System.out.println(asLong);


    }

    @Test
    public void mm() {
        Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8};
        List<Integer> listOfIntegers =
                new ArrayList<>(Arrays.asList(intArray));
        List<Integer> integers = Collections.synchronizedList(listOfIntegers);
        List<Integer> parallelStorage = new ArrayList<>();//Collections.synchronizedList(new ArrayList<>());
        integers
                .parallelStream()
                // Don't do this! It uses a stateful lambda expression.
                .map(e -> {
                    parallelStorage.add(e);
                    return e;
                })
                .forEachOrdered(e -> System.out.print(e + " "));
        System.out.println();
        parallelStorage
                .stream()
                .forEachOrdered(e -> System.out.print(e + " "));
        System.out.println();
        System.out.println("Sleep 5 sec");
        //TimeUnit.SECONDS.sleep(5);
        parallelStorage
                .stream()
                .forEachOrdered(e -> System.out.print(e + " "));
    }

    @Test
    public void me() {
        ArrayList<String> objects = new ArrayList<>();
        objects.forEach(e -> System.out.println(e));
    }

    @Test
    public void mmmm() {
        System.out.println(10 >> 1);
        System.out.println(10 << 1);
        System.out.println(9 >> 1);
        /*int a = 1;
        int b = 3000000;
        String str = String.format("%2$(,4d", a,b);
        System.out.println(str);*/
    }

    @Test
    public void mmi() {
        //redisTemplate.opsForValue().get()
        //stringRedisTempla
        String s = new String();
        int i = s.indexOf(2);

    }


    /**
     * 流的处理
     */
    @Test
    public void mee() {
      /*  String xiaoming = String.format("nihao%s", "xiaoming");
        System.out.println(xiaoming);
*/
        List<Integer> list = Arrays.asList(1, 2, 3);
        // list.stream().reduce()


    }

    //xianchengci
    @Test
    public void m1mm() {
        ScheduledThreadPoolExecutor exec = new ScheduledThreadPoolExecutor(1);

        exec.scheduleAtFixedRate(new Runnable() {//每隔一段时间就触发异常

            @Override

            public void run() {

                //throw new RuntimeException();

                System.out.println("================");

            }

        }, 1000, 5000, TimeUnit.MILLISECONDS);

        exec.scheduleAtFixedRate(new Runnable() {//每隔一段时间打印系统时间，证明两者是互不影响的

            @Override

            public void run() {

                System.out.println(System.nanoTime());
                System.out.println(55);
                System.out.println(22);
                System.out.println(44);
            }
        }, 1000, 2000, TimeUnit.MILLISECONDS);

        System.out.println("huituicheshi");
        System.out.println("huituicheshi1");

    }
}


interface ddd {

    void method1(int a);

}
