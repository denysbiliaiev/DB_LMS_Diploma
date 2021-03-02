package com.biliaiev.DB_LMS_Diploma.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Group implements IPersistenceEntity {

    private Integer id;
    private String name;
    private String direction;
    private LocalDate startDate;

    private List<Teacher> teachers;
    private List<Student> students;
    private List<Lesson> lessons;
    private Feed feed;

    public Group(String name, String direction, LocalDate startDate) {
        this.name = name;
        this.direction = direction;
        this.startDate = startDate;
        this.feed = new Feed(this);
    }

    public Integer getId() { return this.id; }

    public void setId(Integer id) { this.id = id; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(ArrayList<Teacher> teachers) {
        this.teachers = teachers;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public List<Lesson> getLessons() {
        return lessons;
    }

    public void setLessons(LinkedList<Lesson> lessons) {
        this.lessons = lessons;
    }

    public Feed getFeed() {
        return feed;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id='" + id + '\'' +
                "name='" + name + '\'' +
                ", direction='" + direction + '\'' +
                ", startDate=" + startDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return id.equals(group.id) &&
                name.equals(group.name) &&
                direction.equals(group.direction) &&
                startDate.equals(group.startDate) &&
                Objects.equals(teachers, group.teachers) &&
                Objects.equals(students, group.students) &&
                Objects.equals(lessons, group.lessons) &&
                Objects.equals(feed, group.feed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, direction, startDate, teachers, students, lessons, feed);
    }
}
