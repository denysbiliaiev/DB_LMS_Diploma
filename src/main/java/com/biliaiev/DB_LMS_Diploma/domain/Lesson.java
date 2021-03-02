package com.biliaiev.DB_LMS_Diploma.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public class Lesson {
    String topic;
    LocalDate date;
    String materials;
    Group group;
    ArrayList<HomeWork> homeWorks;

    public Lesson(String topic, LocalDate date, String materials, Group group) {
        this.topic = topic;
        this.date = date;
        this.materials = materials;
        this.group = group;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getMaterials() {
        return materials;
    }

    public void setMaterials(String materials) {
        this.materials = materials;
    }

    public Group getGroup() {
        return group;
    }

    public ArrayList<HomeWork> getHomeWorks() {
        return homeWorks;
    }

    public void addHomeWorks(HomeWork homeWork) {
        if (homeWorks == null) {
            homeWorks = new ArrayList<>();
        }

        homeWorks.add(homeWork);
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "topic='" + topic + '\'' +
                ", date=" + date +
                ", materials='" + materials + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lesson lesson = (Lesson) o;
        return topic.equals(lesson.topic) &&
                date.equals(lesson.date) &&
                materials.equals(lesson.materials);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topic, date, materials);
    }
}
