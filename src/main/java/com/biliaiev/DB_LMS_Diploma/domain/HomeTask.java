package com.biliaiev.DB_LMS_Diploma.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class HomeTask implements PersistenceEntity {
    private Integer id;
    private LocalDate date;
    private LocalDate deadLine;
    private String materials;
    private Lesson lesson;
    private Teacher teacher;
    private List<HomeWork> homeWorks;

    public HomeTask(LocalDate date, LocalDate deadLine, String materials, Lesson lesson, Teacher teacher) {
        this.date = date;
        this.deadLine = deadLine;
        this.materials = materials;
        this.lesson = lesson;
        this.teacher = teacher;
    }

    public Integer getId() { return id; }

    public void setId(Integer id) { this.id = id; }

    public LocalDate getDate() {
        return date;
    }

    public LocalDate getDeadLine() {
        return deadLine;
    }

    public String getMaterials() {
        return materials;
    }

    public Lesson getLesson() {
        return lesson;
    }

    public List<HomeWork> getHomeWorks() {
        return homeWorks;
    }

    public boolean addHomeWork(HomeWork homeWork) {
        if (homeWorks == null) {
            homeWorks = new ArrayList<>();
        }

        return homeWorks.add(homeWork);
    }
}
