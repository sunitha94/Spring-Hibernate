package com.example.dao;

import com.example.config.DataBaseconfig;
import com.example.model.Student;
import com.example.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;

/**
 * Created by AL1729 on 28-11-2016.
 */
@Repository
@Transactional
public class StudentDaoImpl implements StudentDao {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student submitForm(Student student) {
        return studentRepository.save(student);
    }
}
