package com.biliaiev.DB_LMS_Diploma.domain;

import java.time.LocalDate;
import java.util.Objects;

public class HomeTask implements IPersistenceEntity {
    private Integer id;
    private String materials;
    private LocalDate deadLine;
    private HomeWork homeWork;

    public HomeTask(String materials, LocalDate deadLine, HomeWork homeWork) {
        this.materials = materials;
        this.deadLine = deadLine;
        this.homeWork = homeWork;
    }

    public Integer getId() { return id; }

    public void setId(Integer id) { this.id = id; }

    public String getMaterials() {
        return materials;
    }

    public LocalDate getDeadLine() {
        return deadLine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HomeTask homeTask = (HomeTask) o;
        return materials.equals(homeTask.materials);
    }

    @Override
    public int hashCode() {
        return Objects.hash(materials);
    }
}
