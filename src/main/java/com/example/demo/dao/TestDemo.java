package com.example.demo.dao;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Assert;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestDemo {
    public static void main(String[] args) {
        System.out.println("第一次尝试");
        System.out.println("第二次尝试");
        List<String> list = Arrays.asList("ni", "hao", "ya");
        list.forEach(e -> System.out.println(e));
        list.sort((a, b) -> a.compareTo(b));
        list.forEach(e -> System.out.println(e));
    }


    @Test
    public void method5(){
        String ss ="ds";
        Assert.notNull(ss,"ss为空");
        System.out.println("----------------");

    }

    @Test
    public void method7(){



    }

    @Test
    public void method6(){
        Logger logger = LoggerFactory.getLogger(getClass());
        logger.info("niaho:$");



    }



    @Test
    public void method(){
        MultiValueMap<String, String> map = new LinkedMultiValueMap<>();
        map.add("aa","nihao1");
        map.add("aa","nihao2");
        map.add("aa1","nihao3");
        List<String> aa = map.get("aa");
        List<String> aa1 = map.get("aa1");


        System.out.println(map);
        Map<String ,String> map1 = new HashMap<>();
        map1.put("m","mm");
        map1.put("m","mmm");
        map1.put("m1","mm1");
        System.out.println(map1);

    }

    @Test
    public void method3 (){
        RestTemplate rest = new RestTemplate();
        ResponseEntity<String> forEntity = rest.getForEntity("http://localhost:8080/demo", String.class);
        System.out.println(forEntity.getBody());

    }
    @Test
    public void method4(){
        String s = "123456789";
       /* String substring = s.substring(0, 3);
        System.out.println(substring);
        String substring1 = s.substring(s.length() - 3);
        System.out.println(substring1);

        StringBuilder ss = new StringBuilder(s);
        StringBuilder replace = ss.replace(3, s.length() - 3, "***");
        System.out.println(replace.toString());

*/
       String sss ="2342sf3243f3332r434r32343";

       //身份证脱敏

        //脱敏第一种办法，前后都保留3个中间为*
        String s1 = sss.replaceAll("(?<=\\w{3})\\w(?=\\w{3})", "*");
        System.out.println(s1);

        //第二种办法，前后保留3个中间全部为***
        String s2 = new StringBuilder(sss).replace(3,sss.length()-3,"***").toString();
        System.out.println(s2);
    }

}


