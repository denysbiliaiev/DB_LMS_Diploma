package com.biliaiev.DB_LMS_Diploma.domain;

import java.time.LocalDate;
import java.util.Objects;

public class Lesson {
    String topic;
    LocalDate date;
    String materials;
    HomeWork homeWork;

    public Lesson(String topic, LocalDate date, String materials, HomeWork homeWork) {
        this.topic = topic;
        this.date = date;
        this.materials = materials;
        this.homeWork = homeWork;
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

    public HomeWork getHomeWork() {
        return homeWork;
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
