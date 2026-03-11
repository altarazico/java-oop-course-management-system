package org.example.app;

import org.example.model.Course;
import org.example.model.Faculty;
import org.example.model.Student;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Student student1 = new Student(1, "Mike");
        Student student2 = new Student(2, "Mansour");

        Course course1 = new Course(001, "Introduction to CS");
        course1.addStudent(student1);
        course1.addStudent(student2);

        Faculty faculty = new Faculty(001, "Dr. Al Tarazi");
        course1.setFaculty(faculty);

        //course1.removeStudent(student2);

        course1.printCourseInfo();

    }
}