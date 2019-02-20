package com.company;

public class Keeper {
    private String keeperId;
    private String firstName;
    private String lastName;
    private String cageAssignment;

    //Constructors
    public Keeper(){

    }

    public Keeper(String keeperId, String firstName, String lastName, String cageAssignment) {
        this.keeperId = keeperId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.cageAssignment = cageAssignment;
    }

    /*
     * New Keeper method
     * Takes a blank Keeper object as parameter
     * Prompts user to enter Keeper details
     * Assigns these inputs to Keeper attributes with
     * setters
     * Keeper cageAssignment ArrayList is looped through and
     * initialised to "None", and ID is automatically generated
     * Returns Keeper object
     */
    public Keeper newKeeper(Keeper keeper) {
        System.out.println("Please enter Keeper first name: ");
        keeper.setFirstName(Validate.validateString());
        System.out.println("Please enter Keeper last name: ");
        keeper.setLastName(Validate.validateString());
        keeper.setKeeperId(Validate.idGenerator("KP"));
        keeper.setCageAssignment("None");
        return keeper;
    }
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
