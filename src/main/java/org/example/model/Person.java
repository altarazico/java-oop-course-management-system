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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Person other = (Person) obj;
        return personId == other.personId;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(personId);
    }

}