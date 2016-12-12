package com.example.service;

import com.example.dao.StudentDao;
import com.example.model.Student;
import com.example.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

/**
 * Created by AL1729 on 26-11-2016.
 */
public class studentServiceImpl implements StudentService {

@Autowired
private StudentDao studentDao;

    @Override
    public Student submitForm(Student student, Model model) {
        return studentDao.submitForm(student);
    }
}
