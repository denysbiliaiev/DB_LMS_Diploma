package com.biliaiev.DB_LMS_Diploma.domain;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Set;

public class Group {

    private String name;
    private String direction;
    private LocalDate startDate;

    private Set<Teacher> teachers;
    private Set<Student> students;
    private Set<Lesson> lessons;
    private Feed feed;

    public Group(String name, String direction, LocalDate startDate) {
        this.name = name;
        this.direction = direction;
        this.startDate = startDate;
        this.feed = new Feed(this);
    }

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

    public Set<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(Set<Teacher> teachers) {
        this.teachers = teachers;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    public Set<Lesson> getLessons() {
        return lessons;
    }

    public void setLessons(Set<Lesson> lessons) {
        this.lessons = lessons;
    }

    public Feed getFeed() {
        return feed;
    }

    @Override
    public String toString() {
        return "Group{" +
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
        return name.equals(group.name) &&
                direction.equals(group.direction) &&
                startDate.equals(group.startDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, direction, startDate);
    }
}
