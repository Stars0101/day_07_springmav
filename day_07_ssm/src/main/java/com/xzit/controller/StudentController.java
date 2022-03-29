package com.xzit.controller;

import com.xzit.entity.Student;
import com.xzit.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class StudentController {
    @Resource
    private StudentService studentService;

    @GetMapping("select")
    public String select(HttpServletRequest request){
        List<Student> list = studentService.SelectList();
        request.setAttribute("list",list) ;
        return "list.jsp";
    }
    @RequestMapping("delete/{id}")
    public String delete(@PathVariable int id){
        studentService.delete(id);
        return "redirect:/select";
    }

    @PostMapping("save")
    public String save(Student student){
        studentService.save(student);
        //重定向
        return "redirect:select";
    }
}
