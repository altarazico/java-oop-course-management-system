package org.example.model;

import java.util.ArrayList;

public class Student extends Person {

    private String major;
    private ArrayList<Course> courses;

    public Student(int personId, String name) {
        super(personId, name);
        this.major = "";
        this.courses = new ArrayList<>();
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void addCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
        }
    }

    public void removeCourse(Course course) {
        courses.remove(course);
    }

    public void printStudentCourses() {
        System.out.println("Student Name: " + getName());
        System.out.println("Registered Courses: " + courses.size());

        for (int i = 0; i < courses.size(); i++) {
            System.out.println("Course: " + courses.get(i).getCourseName());
        }
    }
}
