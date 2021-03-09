package com.biliaiev.DB_LMS_Diploma.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Lesson implements PersistenceEntity {
    private Integer id;
    private String topic;
    private LocalDate date;
    private String materials;
    private Group group;
    private List<HomeTask> homeTasks;

    public Lesson(String topic, LocalDate date, String materials, Group group) {
        this.topic = topic;
        this.date = date;
        this.materials = materials;
        this.group = group;
    }

    public Integer getId() { return id; }

    public void setId(Integer id) { this.id = id; }

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

    public List<HomeTask> getHomeTasks() {
        return homeTasks;
    }

    public boolean addHomeTasks(HomeTask homeTask) {
        if (homeTasks == null) {
            homeTasks = new ArrayList<>();
        }

        return homeTasks.add(homeTask);
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
