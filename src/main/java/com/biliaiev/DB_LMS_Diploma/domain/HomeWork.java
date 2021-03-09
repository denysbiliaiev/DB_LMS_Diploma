package com.biliaiev.DB_LMS_Diploma.domain;

public class HomeWork implements PersistenceEntity {
    private Integer id;
    private HomeTask homeTask;
    private Student student;
    private Integer points;

    public HomeWork(HomeTask homeTask, Student student) {
        this.homeTask = homeTask;
        this.student = student;
    }

    public Integer getId() { return id; }

    public void setId(Integer id) { this.id = id; }

    public HomeTask getHomeTask() {
        return homeTask;
    }

    public Student getStudent() {
        return student;
    }

    public Integer getPoints() {
        return points;
    }

    public boolean setPoints(Integer points) {
        this.points = points;
        return true;
    }
}
