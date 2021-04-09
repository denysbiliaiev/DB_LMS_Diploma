package com.biliaiev.DB_LMS_Diploma.service;

import com.biliaiev.DB_LMS_Diploma.dao.GenericDao;
import com.biliaiev.DB_LMS_Diploma.domain.Group;
import com.biliaiev.DB_LMS_Diploma.domain.Lesson;
import com.biliaiev.DB_LMS_Diploma.domain.Student;
import com.biliaiev.DB_LMS_Diploma.domain.Teacher;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class GroupServiceImpl implements GroupService {
    private static final Logger logger = LogManager.getLogger(GroupServiceImpl.class);

    GenericDao<Group> groupDao;

    public GroupServiceImpl(GenericDao<Group> groupDao) {
        this.groupDao = groupDao;
    }

    @Override
    public Group createGroup(String name, String direction, LocalDate startDate) {
        return new Group(name, direction, startDate);
    }

    @Override
    public void createLessonsStubs(Group group, int minimumAmount) {
        List<Lesson> lessons = new LinkedList<>();

        for (int i = 0; i < minimumAmount; i++) {
            lessons.add(new Lesson("", null, "", group));
        }

        group.getLessons().addAll(lessons);
    }

    @Override
    public boolean addStudent(Group group, Student student) {
        return group.getStudents().add(student);
    }

    @Override
    public boolean addTeacher(Group group, Teacher teacher) {
        teacher.addGroup(group);
        return group.getTeachers().add(teacher);
    }

    @Override
    public boolean saveGroup(Group group) {
        if (!validateGroup(group)) {
            return false;
        }

        groupDao.saveEntity(group);
        return true;
    }

    private boolean validateGroup(Group group) {
        if (group.getStudents().size() < 12) return false;
        if (group.getTeachers().size() < 1) return false;
        if (group.getLessons().size() < 32) return false;
        if (group.getFeed() == null) return false;

        return false;
    }
}
