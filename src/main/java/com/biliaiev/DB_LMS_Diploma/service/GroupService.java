package com.biliaiev.DB_LMS_Diploma.service;

import com.biliaiev.DB_LMS_Diploma.domain.Group;
import com.biliaiev.DB_LMS_Diploma.domain.Student;
import com.biliaiev.DB_LMS_Diploma.domain.Teacher;

import java.time.LocalDate;

public interface GroupService {
    Group createGroup(String name, String direction, LocalDate startDate);

    void createLessonsStubs(Group group, int minimumAmount);

    boolean addStudent(Group group, Student student);

    boolean addTeacher(Group group, Teacher teacher);

    boolean saveGroup (Group group);
}
