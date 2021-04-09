package com.biliaiev.DB_LMS_Diploma.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Teacher extends User implements PersistenceEntity {
    private Integer id;
    private String role;
    private List<Group> groups;

    public Teacher(String firstName, String lastName, LocalDate dateOfBirth, String role) {
        super(firstName, lastName, dateOfBirth);
        this.role = role;
    }

    public Integer getId() { return id; }

    public void setId(Integer id) { this.id = id; }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean addGroup(Group group) {
        if (this.groups == null) {
            this.groups = new ArrayList<>();
        }

        return groups.add(group);
    }

    public List<Group> getGroups() {
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
