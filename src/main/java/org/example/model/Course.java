package org.example.model;

import java.util.ArrayList;

public class Course {

    private int courseId;
    private String courseName;
    private Faculty faculty;
    private ArrayList<Student> students;

    public Course (int pCourseId, String pCourseName) {
        this.courseId = pCourseId;
        this.courseName = pCourseName;
        students = new ArrayList<>();
    }

    public void addStudent (Student pStudent) {
        students.add(pStudent);
    }

    public void removeStudent(Student pStudent) {
        students.remove(pStudent);
    }

    public void setFaculty(Faculty pFaculty) {
        faculty = pFaculty;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void printCourseInfo() {
        System.out.println("Course Id: " + courseId);
        System.out.println("Course Name: " + courseName);
        System.out.println("Faculty Name: " + faculty.getName());
        System.out.println("Number of Students: " + students.size());

        for (int i = 0; i< students.size(); i++) {
            System.out.println("Student: " +students.get(i).getName());
        }
    }

}

