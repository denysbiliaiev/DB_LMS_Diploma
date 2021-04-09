package com.biliaiev.DB_LMS_Diploma.service;

import com.biliaiev.DB_LMS_Diploma.domain.*;

import java.time.LocalDate;

public interface HomeWorkService {
    HomeWork createHomeWork(HomeTask homeTask, Student student);

    boolean setPoints(HomeWork homeWork, Integer integer);

    boolean saveHomeWork(HomeWork homeWork);
}
