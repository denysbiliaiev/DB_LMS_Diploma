package com.biliaiev.DB_LMS_Diploma;

import com.biliaiev.DB_LMS_Diploma.dao.GenericDao;
import com.biliaiev.DB_LMS_Diploma.dao.InMemoryImpl.InMemoryDaoImpl;
import com.biliaiev.DB_LMS_Diploma.domain.*;
import com.biliaiev.DB_LMS_Diploma.service.*;

import java.time.LocalDate;

public class Runner {
    public static void main(String[] args) {

        GenericDao<Group> groupDao = new InMemoryDaoImpl();
        GenericDao<Feed> feedDao = new InMemoryDaoImpl();
        GenericDao<Lesson> lessonDao = new InMemoryDaoImpl();
        GenericDao<Student> studentDao = new InMemoryDaoImpl();
        GenericDao<Teacher> teacherDao = new InMemoryDaoImpl();
        GenericDao<HomeTask> homeTaskDao = new InMemoryDaoImpl();
        GenericDao<HomeWork> homeWorkDao = new InMemoryDaoImpl();
        GenericDao<Post> postDao = new InMemoryDaoImpl();

        GroupService groupService = new GroupServiceImpl(groupDao);
        FeedService feedService = new FeedServiceImpl(feedDao);
        LessonService lessonService = new LessonServiceImpl(lessonDao);
        StudentService studentService = new StudentServiceImpl(studentDao);
        TeacherService teacherService = new TeacherServiceImpl(teacherDao);
        HomeTaskService homeTaskService = new HomeTaskServiceImpl(homeTaskDao);
        HomeWorkService homeWorkService = new HomeWorkServiceImpl(homeWorkDao);
        PostService postService = new PostServiceImpl(postDao);

        Group javaElementaryGroup = groupService.createGroup("Java Elementary", "Backend", LocalDate.of(2021, 4, 1));

        Feed javaElementaryGroupFeed = feedService.createFeed(javaElementaryGroup);

        Teacher teacher1 = teacherService.createTeacher("Ted", "Book", LocalDate.of(1995, 6, 25), "TEACHER");
        Teacher teacher2 = teacherService.createTeacher("Tor", "Scientist", LocalDate.of(1989, 9, 3), "ASSISTANT");

        Student student1 = studentService.createStudent("Will", "Geek", LocalDate.of(2000, 2, 20), javaElementaryGroup);
        Student student2 = studentService.createStudent("Bill", "Tester", LocalDate.of(2001, 5, 15), javaElementaryGroup);

        Lesson lesson1 = lessonService.createLesson("Let's start", LocalDate.of(2021, 4, 1), "for reading, lesson 1", javaElementaryGroup);
        Lesson lesson2 = lessonService.createLesson("Let's start", LocalDate.of(2021, 4, 1), "for reading, lesson 2", javaElementaryGroup);

        HomeTask homeTask1 = homeTaskService.createHomeTask(LocalDate.now(), LocalDate.of(2021, 4, 1), "task description, lesson 1", lesson1, teacher1);
        HomeTask homeTask2= homeTaskService.createHomeTask(LocalDate.now(), LocalDate.of(2021, 4, 1), "task description, lesson 2", lesson1, teacher1);

        HomeWork homeWork1_1 = homeWorkService.createHomeWork(homeTask1, student1);
        HomeWork homeWork2_1 = homeWorkService.createHomeWork(homeTask1, student1);
        HomeWork homeWork1_2 = homeWorkService.createHomeWork(homeTask1, student2);

        Post postHelloStudents = postService.createPost("Hello students!", LocalDate.now(), teacher1);

        //ADD GROUP
        groupService.createLessonsStubs(javaElementaryGroup, 16);

        //ADD STUDENTS
        groupService.addStudent(javaElementaryGroup, student1);
        groupService.addStudent(javaElementaryGroup, student2);

        //ADD TEACHERS
        groupService.addTeacher(javaElementaryGroup, teacher1);
        groupService.addTeacher(javaElementaryGroup, teacher2);

        //ADD HOMETASK
        lessonService.addHomeTask(lesson1, homeTask1);
        lessonService.addHomeTask(lesson2, homeTask2);

        //ADD POST
        feedService.addPost(javaElementaryGroupFeed, postHelloStudents);

        //ADD HOMEWORK
        homeTaskService.addHomeWork(homeWork1_1);
        homeTaskService.addHomeWork(homeWork1_2);

        //SET POINTS
        homeWorkService.setPoints(homeWork1_1, 90);
        homeWorkService.setPoints(homeWork1_1, 100);

        Group savedGroup = groupDao.saveEntity(javaElementaryGroup);
        feedDao.saveEntity(javaElementaryGroupFeed);
        lessonDao.saveEntity(lesson1);
        studentDao.saveEntity(student1);
        teacherDao.saveEntity(teacher1);
        homeTaskDao.saveEntity(homeTask1);
        homeWorkDao.saveEntity(homeWork1_1);
        postDao.saveEntity(postHelloStudents);

        groupDao.getEntity(savedGroup.getId());

        System.out.println();
    }
}
