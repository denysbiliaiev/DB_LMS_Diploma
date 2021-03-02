package com.biliaiev.DB_LMS_Diploma.domain;

import java.time.LocalDate;

public class HomeWork {
    HomeTask homeTask;
    LocalDate date;
    LocalDate deadLine;
    Teacher teacher;
    Lesson lesson;

    public HomeWork(LocalDate date, LocalDate deadLine, String materials, Teacher teacher, Lesson lesson) {
        this.date = date;
        this.homeTask = new HomeTask(materials, deadLine, this);
        this.teacher = teacher;
        this.lesson = lesson;
    }

    public HomeTask getHomeTask() {
        return homeTask;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalDate getDeadLine() {
        return deadLine;
    }
}
