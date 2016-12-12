package com.example.repository;

import com.example.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by AL1729 on 28-11-2016.
 */

public interface StudentRepository extends CrudRepository<Student,Integer> {

}
