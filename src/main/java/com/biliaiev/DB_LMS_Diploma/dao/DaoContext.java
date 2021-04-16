package com.biliaiev.DB_LMS_Diploma.dao;

import com.biliaiev.DB_LMS_Diploma.domain.*;

public class DaoContext {

    private static DaoContext instance = null;
    private static DaoType daoType;

    GenericDao<Group> groupDao;
    GenericDao<Feed> feedDao;
    GenericDao<Lesson> lessonDao;
    GenericDao<Student> studentDao;
    GenericDao<Teacher> teacherDao;
    GenericDao<HomeTask> homeTaskDao;
    GenericDao<HomeWork> homeWorkDao;
    GenericDao<Post> postDao;

    public DaoContext() {
        DaoAbstractFactory daoAbstractFactory = new DaoAbstractFactory(DaoContext.daoType);

        this.groupDao = daoAbstractFactory.createDao();
        this.feedDao = daoAbstractFactory.createDao();
        this.lessonDao = daoAbstractFactory.createDao();
        this.studentDao = daoAbstractFactory.createDao();
        this.teacherDao = daoAbstractFactory.createDao();
        this.homeTaskDao = daoAbstractFactory.createDao();
        this.homeWorkDao = daoAbstractFactory.createDao();
        this.postDao = daoAbstractFactory.createDao();
    }

    public static DaoContext getInstance() {
        if (instance == null) {
            instance = new DaoContext();
        }

        return instance;
    }

    public static void init(DaoType daoType) {
        DaoContext.daoType = daoType;
    }

    public GenericDao<Group> getGroupDao() {
        return groupDao;
    }

    public GenericDao<Feed> getFeedDao() {
        return feedDao;
    }

    public GenericDao<Lesson> getLessonDao() {
        return lessonDao;
    }

    public GenericDao<Student> getStudentDao() {
        return studentDao;
    }

    public GenericDao<Teacher> getTeacherDao() {
        return teacherDao;
    }

    public GenericDao<HomeTask> getHomeTaskDao() {
        return homeTaskDao;
    }

    public GenericDao<HomeWork> getHomeWorkDao() {
        return homeWorkDao;
    }

    public GenericDao<Post> getPostDao() {
        return postDao;
    }
}
