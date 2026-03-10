package org.example.model;

public class Person {

    // Attributes
    private int personId;
    private String name;

    // Constructor
    public Person(int personId, String name) {
        this.personId = personId;
        this.name = name;
    }

    // Getter for personId
    public int getPersonId() {
        return personId;
    }

    // Setter for personId
    public void setPersonId(int personId) {
        this.personId = personId;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

}