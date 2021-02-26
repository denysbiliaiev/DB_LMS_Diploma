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

    public Group(String name, String direction, LocalDate startDate, Set<Student> students) {
        this.name = name;
        this.direction = direction;
        this.startDate = startDate;
        this.students = students;
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
