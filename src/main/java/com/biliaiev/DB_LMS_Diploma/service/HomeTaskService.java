package com.biliaiev.DB_LMS_Diploma.service;

import com.biliaiev.DB_LMS_Diploma.domain.*;

import java.time.LocalDate;

public interface HomeTaskService {
    HomeTask createHomeTask(LocalDate date, LocalDate deadLine, String materials, Lesson lesson, Teacher teacher);

    boolean addHomeWork(HomeWork homeWork);

    boolean saveHomeTask(HomeTask homeTask);
}
