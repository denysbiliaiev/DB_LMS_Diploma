package com.biliaiev.DB_LMS_Diploma.domain;

import java.time.LocalDate;

public class HomeWork implements IPersistenceEntity {
    private Integer id;
    private HomeTask homeTask;
    private LocalDate date;
    private LocalDate deadLine;
    private Student student;
    private Lesson lesson;

    public HomeWork(LocalDate date, LocalDate deadLine, String materials, Student student, Lesson lesson) {
        this.date = date;
        this.homeTask = new HomeTask(materials, deadLine, this);
        this.student = student;
        this.lesson = lesson;
    }

    public Integer getId() { return id; }

    public void setId(Integer id) { this.id = id; }

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
