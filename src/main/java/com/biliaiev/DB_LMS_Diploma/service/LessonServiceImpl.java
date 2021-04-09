package com.biliaiev.DB_LMS_Diploma.service;

import com.biliaiev.DB_LMS_Diploma.dao.GenericDao;
import com.biliaiev.DB_LMS_Diploma.domain.Group;
import com.biliaiev.DB_LMS_Diploma.domain.HomeTask;
import com.biliaiev.DB_LMS_Diploma.domain.HomeWork;
import com.biliaiev.DB_LMS_Diploma.domain.Lesson;

import java.time.LocalDate;

public class LessonServiceImpl implements LessonService {
    GenericDao<Lesson> lessonDao;

    public LessonServiceImpl(GenericDao<Lesson> lessonDao) {
        this.lessonDao = lessonDao;
    }

    @Override
    public Lesson createLesson(String topic, LocalDate date, String materials, Group group) {
        return new Lesson(topic, date, materials, group);
    }

    @Override
    public boolean addHomeTask(Lesson lesson, HomeTask homeTask) {
        return lesson.addHomeTasks(homeTask);
    }
}
