package com.biliaiev.DB_LMS_Diploma.domain;

import java.util.Objects;

public class HomeTask {
    private String materials;

    public HomeTask(String materials) {
        this.materials = materials;
    }

    public String getMaterials() {
        return materials;
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
