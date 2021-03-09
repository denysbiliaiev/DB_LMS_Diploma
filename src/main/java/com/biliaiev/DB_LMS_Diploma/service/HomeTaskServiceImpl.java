package com.biliaiev.DB_LMS_Diploma.service;

import com.biliaiev.DB_LMS_Diploma.dao.GenericDao;
import com.biliaiev.DB_LMS_Diploma.domain.*;

import java.time.LocalDate;

public class HomeTaskServiceImpl implements HomeTaskService {
    GenericDao<HomeTask> homeTaskDao;

    public HomeTaskServiceImpl(GenericDao<HomeTask> homeTaskDao) {
        this.homeTaskDao = homeTaskDao;
    }

    @Override
    public HomeTask createHomeTask(LocalDate deadLine, LocalDate date, String materials, Lesson lesson, Teacher teacher) {
        return new HomeTask(deadLine, date, materials, lesson, teacher);
    }

    @Override
    public boolean addHomeWork(HomeWork homeWork) {
        return homeWork.getHomeTask().addHomeWork(homeWork);
    }

    @Override
    public boolean saveHomeTask(HomeTask homeTask) {
        homeTaskDao.saveEntity(homeTask);

        return true;
    }
}
