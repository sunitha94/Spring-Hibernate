package com.example.service;

import com.example.model.Student;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

/**
 * Created by AL1729 on 26-11-2016.
 */
@Service
public interface StudentService {
    Student submitForm(Student student, Model model);

}
