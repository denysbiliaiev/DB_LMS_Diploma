package com.biliaiev.DB_LMS_Diploma.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public class Teacher extends User {

    private String role;
    private ArrayList<Group> groups;

    public Teacher(String firstName, String lastName, LocalDate dateOfBirth, String role) {
        super(firstName, lastName, dateOfBirth);
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void addGroup(Group group) {
        if (this.groups == null) {
            this.groups = new ArrayList<>();
        }

        groups.add(group);
    }

    public ArrayList<Group> getGroups() {
        return this.groups;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth='" + dateOfBirth +
                ", role=" + role +
                '}';
    }
}
