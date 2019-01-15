package com.example.demo.dao;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class LockTest {

    public static void main(String[] args) {
        new Thread(() ->
        method("a")
    ).start();
        new Thread(() ->
        method("b")
    ).start();


}

    public static void method(String str) {
        Lock lock = new ReentrantLock();
        ReentrantReadWriteLock lock1 = new ReentrantReadWriteLock();
        lock1.readLock().lock();
        lock.lock();

        try {
            for (int i = 0; i < 3; i++) {
                System.out.println(str);
            }
        } finally {
            lock.unlock();
        }
    }




}
