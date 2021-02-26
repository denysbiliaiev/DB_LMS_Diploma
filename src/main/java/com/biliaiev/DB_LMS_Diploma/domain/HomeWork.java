package com.biliaiev.DB_LMS_Diploma.domain;

import java.time.LocalDate;

public class HomeWork {
    HomeTask homeTask;
    LocalDate date;
    LocalDate deadLine;

    public HomeWork(LocalDate date, LocalDate deadLine, String materials) {
        this.date = date;
        this.deadLine = deadLine;
        this.homeTask = new HomeTask(materials);
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
