package com.biliaiev.DB_LMS_Diploma.service;

import com.biliaiev.DB_LMS_Diploma.dao.GenericDao;
import com.biliaiev.DB_LMS_Diploma.domain.Group;
import com.biliaiev.DB_LMS_Diploma.domain.Post;
import com.biliaiev.DB_LMS_Diploma.domain.Student;

import java.time.LocalDate;

public class StudentServiceImpl implements StudentService {
    GenericDao<Student> studentDao;

    public StudentServiceImpl(GenericDao<Student> studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public Student createStudent(String firstName, String lastName, LocalDate dateOfBirth, Group group) {
        return new Student(firstName, lastName, dateOfBirth, group);
    }
}
