package com.biliaiev.DB_LMS_Diploma.service;

import com.biliaiev.DB_LMS_Diploma.domain.Group;
import com.biliaiev.DB_LMS_Diploma.domain.Teacher;

import java.time.LocalDate;

public interface TeacherService {
    Teacher createTeacher(String firstName, String lastName, LocalDate dateOfBirth, String role);

    boolean addGroup(Teacher teacher, Group group);
}
