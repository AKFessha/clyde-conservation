package com.company;

public class Keeper {
    private String keeperId;
    private String firstName;
    private String lastName;
    private String cageAssignment;


    //Getters and setters

    public String getKeeperId() {
        return keeperId;
    }

    public void setKeeperId(String keeperId) {
        this.keeperId = keeperId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCageAssignment() {
        return cageAssignment;
    }

    public void setCageAssignment(String cageAssignment) {
        this.cageAssignment = cageAssignment;
    }
}
