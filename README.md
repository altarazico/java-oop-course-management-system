# Java OOP Course Management System

## Overview

This project is a **Java Object-Oriented Programming (OOP) exercise** that models a simple university course management system.
The goal is to practice **core OOP principles** such as inheritance, object relationships, encapsulation, and class design.

The system models the relationship between:

* Students
* Faculty
* Courses

and allows tracking **which students are enrolled in which courses and which faculty teaches each course**.

---

## OOP Concepts Practiced

This project demonstrates several important Java concepts:

* **Inheritance**

  * `Student` and `Faculty` extend the `Person` class.

* **Encapsulation**

  * Attributes are private and accessed through methods.

* **Object Relationships**

  * Courses contain a list of students.
  * Courses are assigned to a faculty member.

* **Collections**

  * `ArrayList` is used to manage enrolled students.

---

## Project Structure

```
src/main/java/org/example
│
├── model
│   ├── Person.java
│   ├── Student.java
│   ├── Faculty.java
│   └── Course.java
│
└── app
    └── Main.java
```

---

## Class Design

### Person

Base class that represents a generic person.

Attributes:

* `personId`
* `name`

---

### Student (extends Person)

Represents a student in the system.

Attributes:

* `major`
* `courses`

Students can enroll in **multiple courses**.

---

### Faculty (extends Person)

Represents a faculty member who teaches courses.

Faculty can teach **multiple courses**.

---

### Course

Represents a course in the system.

Attributes:

* `courseId`
* `courseName`
* `Faculty faculty`
* `ArrayList<Student> students`

Key behaviors:

* Add students to a course
* Assign a faculty member
* Retrieve enrolled students

---

## Example System Behavior

The system will allow actions such as:

* Creating courses
* Creating students and faculty
* Enrolling students in courses
* Assigning faculty to teach courses
* Reporting which students take which course

---

## Technologies Used

* Java
* IntelliJ IDEA
* Maven
* Git
* GitHub

---

## Learning Goal

This project is designed as a **step-by-step learning exercise** to strengthen understanding of:

* Java class design
* Object relationships
* Clean project structure
* Version control with GitHub

---

## Author

**Ramzi Al Tarazi**
OCI Architect | Java Developer | Oracle Cloud Infrastructure | GenAI Automation
