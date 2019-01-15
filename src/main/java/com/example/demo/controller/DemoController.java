package com.example.demo.controller;


import com.example.demo.service.DemoServic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/**
 *@Description:Demo相关的控制层
 *@Author: 胡剑雄
 *@Date: 2018-12-10 15:07
 */

@RestController
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private DemoServic demoServic;


    /**
     ** @param name
     * @param age    年龄
     * @return  list 返回一个记录数据的list
     */
    @PostMapping ("/method")
    public List<String> method( String name, String age){
        List<String> list = demoServic.method();
        //git
        System.out.println(name);
        System.out.println(age);
        list.add(name);
        System.out.println("nihao");

//        list.add(jj.toString());
        return list;
    }


}
