package com.xzit.controller;

import com.xzit.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//如果当前controller中所有方法都以Json返回,使用@RestController
@RestController
public class JsonController {
    @RequestMapping("returnJson")
    //使用下面的注解表示以Json的格式返回
    //@ResponseBody
    public Object returnJson(){
        Student student = new Student();
        student.setName("aaa").setAge(13).setGender("man");
        return student;
    }
}
