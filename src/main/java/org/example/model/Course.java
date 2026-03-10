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

    public void setFaculty(Faculty pFaculty) {
        faculty = pFaculty;
    }
}
