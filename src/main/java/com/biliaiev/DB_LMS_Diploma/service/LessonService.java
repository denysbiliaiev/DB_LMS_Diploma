package com.biliaiev.DB_LMS_Diploma.service;

import com.biliaiev.DB_LMS_Diploma.domain.Group;
import com.biliaiev.DB_LMS_Diploma.domain.HomeTask;
import com.biliaiev.DB_LMS_Diploma.domain.Lesson;
import java.time.LocalDate;

public interface LessonService {
    Lesson createLesson(String topic, LocalDate date, String materials, Group group);

    boolean addHomeTask(Lesson lesson, HomeTask homeTask);
}
