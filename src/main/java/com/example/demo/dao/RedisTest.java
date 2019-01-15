package com.example.demo.dao;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.collections.bag.SynchronizedSortedBag;

import java.util.ArrayList;
import java.util.List;

public class RedisTest {

    public static void main(String[] args) {
        Demo d = new Demo("ss","sss");
        String o = JSON.toJSONString(d);
        System.out.println(o);
        System.out.println(d);
        Demo demo = JSON.parseObject(o, Demo.class);
        System.out.println(demo);
        Demo demo1 = JSONObject.parseObject(o, Demo.class);
        System.out.println(demo1);
        System.out.println("-------------------");
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        String s = JSON.toJSONString(list);
        System.out.println(s);
        System.out.println(list);
        System.out.println(JSONArray.parseArray(s,String.class));
        String str = "{'s':'11','x':'12'}";
        System.out.println(JSONObject.parseObject(str,Demo.class));
    }
}

class Demo {
    private String s;
    private String x;

    public Demo() {
    }

    public Demo(String s, String x) {
        this.s = s;
        this.x = x;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "Demo{" +
                "s='" + s + '\'' +
                ", x='" + x + '\'' +
                '}';
    }
}