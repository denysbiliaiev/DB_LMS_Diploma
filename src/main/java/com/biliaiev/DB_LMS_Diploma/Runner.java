package com.biliaiev.DB_LMS_Diploma;

import com.biliaiev.DB_LMS_Diploma.domain.*;

import java.time.LocalDate;
import java.util.*;

public class Runner {
    public static void main(String[] args) {

        Group group = new Group("Java Elementary", "Backend", LocalDate.of(2021, 4, 1));
        Feed feed = group.getFeed();
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Teacher> teachers = new ArrayList<>();
        LinkedList<Lesson> lessons = new LinkedList<>();

        Teacher teacher1 = new Teacher("Ted", "Book", LocalDate.of(1995, 6, 25), "TEACHER");
        Teacher teacher2 = new Teacher("Tor", "Scientist", LocalDate.of(1989, 9, 3), "ASSISTANT");

        Student student1 = new Student("Will", "Geek", LocalDate.of(2000, 2, 20), group);
        Student student2 = new Student("Bill", "Tester", LocalDate.of(2001, 5, 15), group);

        Lesson lesson1 = new Lesson("Let's start", LocalDate.of(2021, 4, 1), "for reading, lesson 1", group);
        Lesson lesson2 = new Lesson("Let's start", LocalDate.of(2021, 4, 1), "for reading, lesson 2", group);

        HomeWork homeWork1_1 = new HomeWork(LocalDate.now(), LocalDate.of(2021, 4, 1), "task description, lesson 1_1", teacher1, lesson1);
        HomeWork homeWork1_2= new HomeWork(LocalDate.now(), LocalDate.of(2021, 4, 1), "task description, lesson 1_2", teacher1, lesson1);
        HomeWork homeWork2_1 = new HomeWork(LocalDate.now(), LocalDate.of(2021, 4, 4), "task description, lesson 2", teacher2, lesson2);

        teachers.add(teacher1);
        teachers.add(teacher2);

        lesson1.addHomeWorks(homeWork1_1);
        lesson1.addHomeWorks(homeWork1_2);

        lesson2.addHomeWorks(homeWork2_1);

        lessons.add(lesson1);
        lessons.add(lesson2);

        students.add(student1);
        students.add(student2);

        group.setTeachers(teachers);
        group.setLessons(lessons);
        group.setStudents(students);

        Post firstPost = new Post("Let's start", LocalDate.now(), teacher1);
        Post secondPost = new Post("Questionnaire", LocalDate.now(), student1);

        feed.addPost(firstPost);
        feed.addPost(secondPost);

        System.out.println();
    }
}
