package com.biliaiev.DB_LMS_Diploma;

import com.biliaiev.DB_LMS_Diploma.domain.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Runner {
    public static void main(String[] args) {

        Group group = new Group("Java Elementary", "Backend", LocalDate.of(2021, 4, 1));
        Feed feed = group.getFeed();
        Set<Student> students = new HashSet<>();
        Set<Teacher> teachers = new HashSet<>();
        Set<Lesson> lessons = new LinkedHashSet<>();

        teachers.add(new Teacher("Ted", "Book", LocalDate.of(1995, 6, 25), "TEACHER"));
        teachers.add(new Teacher("Tor", "Scientist", LocalDate.of(1989, 9, 3), "ASSISTANT"));

        lessons.add(new Lesson("Let's start", LocalDate.of(2021, 4, 1), "for reading, lesson 1", null));
        lessons.add(new Lesson("Primitives", LocalDate.of(2021, 4, 4), "for reading, lesson 2",
                new HomeWork(LocalDate.now(), LocalDate.of(2021, 4, 4), "task description, lesson 2")));

        students.add(new Student("Will", "Geek", LocalDate.of(2000, 2, 20), group));
        students.add(new Student("Bill", "Tester", LocalDate.of(2001, 5, 15), group));

        group.setTeachers(teachers);
        group.setLessons(lessons);
        group.setStudents(students);

        Post firstPost = new Post("Let's start", LocalDate.now());
        Post secondPost = new Post("Questionnaire", LocalDate.now());

        feed.addPost(firstPost);
        feed.addPost(secondPost);

        System.out.println();
    }
}
