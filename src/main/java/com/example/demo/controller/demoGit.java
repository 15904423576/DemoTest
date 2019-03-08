package com.example.demo.controller;

import com.example.demo.dto.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class demoGit {

    @Autowired
    private Person person;
    @GetMapping("/aaa")
    public String method(@RequestBody @Validated Person p, BindingResult bindingResult){
        List<ObjectError> allErrors = bindingResult.getAllErrors();
        System.out.println(allErrors);
        allErrors.forEach(e->System.out.println(e));
    //System.out.println(person);
        return allErrors.toString();

    }

    @GetMapping("/bbb")
    public String method1(){
        return  "nihao";
    }


}
