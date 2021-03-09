package com.biliaiev.DB_LMS_Diploma.service;

import com.biliaiev.DB_LMS_Diploma.domain.Group;
import com.biliaiev.DB_LMS_Diploma.domain.Student;

import java.time.LocalDate;

public interface StudentService {
    Student createStudent(String firstName, String lastName, LocalDate dateOfBirth, Group group);
}
