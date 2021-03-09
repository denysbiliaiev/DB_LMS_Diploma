package com.biliaiev.DB_LMS_Diploma.service;

import com.biliaiev.DB_LMS_Diploma.dao.GenericDao;
import com.biliaiev.DB_LMS_Diploma.domain.HomeTask;
import com.biliaiev.DB_LMS_Diploma.domain.HomeWork;
import com.biliaiev.DB_LMS_Diploma.domain.Student;

public class HomeWorkServiceImpl implements HomeWorkService {
    GenericDao<HomeWork> homeWorkDao;

    public HomeWorkServiceImpl(GenericDao<HomeWork> homeWorkDao) {
        this.homeWorkDao = homeWorkDao;
    }

    @Override
    public HomeWork createHomeWork(HomeTask homeTask, Student student) {
        return new HomeWork(homeTask, student);
    }

    @Override
    public boolean setPoints(HomeWork homeWork, Integer points) {
        return homeWork.setPoints(points);
    }

    @Override
    public boolean saveHomeWork(HomeWork homeWork) {
        homeWorkDao.saveEntity(homeWork);

        return  true;
    }
}
