package com.example.demo.service.impl;

import com.example.demo.service.DemoServic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DemoServicImpl implements DemoServic {

    @Autowired
    //private DemoDao dao;

    @Override
    public List<String> method() {
        List<String> list = new ArrayList<>();
        list.add("你好");
        list.add("我好");
        list.add("好呀");
        return list;
    }
}
