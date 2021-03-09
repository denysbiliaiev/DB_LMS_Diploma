package com.biliaiev.DB_LMS_Diploma.service;

import com.biliaiev.DB_LMS_Diploma.dao.GenericDao;
import com.biliaiev.DB_LMS_Diploma.domain.Group;
import com.biliaiev.DB_LMS_Diploma.domain.Student;
import com.biliaiev.DB_LMS_Diploma.domain.Teacher;

import java.time.LocalDate;

public class TeacherServiceImpl implements TeacherService {
    GenericDao<Teacher> teacherDao;

    public TeacherServiceImpl(GenericDao<Teacher> teacherDao) {
        this.teacherDao = teacherDao;
    }

    @Override
    public Teacher createTeacher(String firstName, String lastName, LocalDate dateOfBirth, String role) {
        return new Teacher(firstName, lastName, dateOfBirth, role);
    }

    @Override
    public boolean addGroup(Teacher teacher, Group group) {
        return teacher.addGroup(group);
    }
}
