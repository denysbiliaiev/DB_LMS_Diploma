package com.biliaiev.DB_LMS_Diploma.domain;

import java.time.LocalDate;

public class Student extends User implements IPersistenceEntity {
    private Integer id;
    private Group group;

    public Student(String firstName, String lastName, LocalDate dateOfBirth, Group group) {
        super(firstName, lastName, dateOfBirth);
        this.group = group;
    }

    public Integer getId() { return id; }

    public void setId(Integer id) { this.id = id; }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth='" + dateOfBirth +
                ", group='" + group.getName() + '\'' +
                '}';
    }
}
