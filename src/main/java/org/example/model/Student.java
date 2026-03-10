package org.example.model;

import java.util.ArrayList;

public class Student extends Person {

    private String major;
    private ArrayList<Course> courses;

    public Student(int personId, String name) {
        super(personId, name);
    }
}
