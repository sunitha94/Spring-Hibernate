package com.example.controller;

import com.example.model.Student;
import com.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by AL1729 on 26-11-2016.
 */
@Controller
public class StudentController {
    @Autowired
    StudentService studentService;

    @RequestMapping(value = "/")
    public String home() {
        return "index";
    }

    @RequestMapping(value = "/create-student")
    public String createStudent(Model model) {
        model.addAttribute("student", new Student());
        return "create-student";
    }

    @RequestMapping(value = "/submit-form")
    public Student submitForm(Student student, Model model) {
        return studentService.submitForm(student, model);
    }
}
