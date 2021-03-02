package com.biliaiev.DB_LMS_Diploma.domain;

import java.time.LocalDate;
import java.util.Objects;

public class Student extends User {

    private Group group;

    public Student(String firstName, String lastName, LocalDate dateOfBirth, Group group) {
        super(firstName, lastName, dateOfBirth);
        this.group = group;
    }

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
