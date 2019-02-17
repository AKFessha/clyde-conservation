package com.company;

public class Animal {
    private String animalID;
    private String animalName;
    private String animalFamiliy;
    private String animalSpecies;
    private String cageAssignment;

    //Constructors
    public Animal(){

    }

    public Animal(String animalID, String animalName, String animalFamiliy, String animalSpecies, String cageAssignment) {
        this.animalID = animalID;
        this.animalName = animalName;
        this.animalFamiliy = animalFamiliy;
        this.animalSpecies = animalSpecies;
        this.cageAssignment = cageAssignment;
    }

    //Getters and setters
    public String getAnimalID() {
        return animalID;
    }

    public void setAnimalID(String animalID) {
        this.animalID = animalID;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getAnimalFamiliy() {
        return animalFamiliy;
    }

    public void setAnimalFamiliy(String animalFamiliy) {
        this.animalFamiliy = animalFamiliy;
    }

    public String getAnimalSpecies() {
        return animalSpecies;
    }

    public void setAnimalSpecies(String animalSpecies) {
        this.animalSpecies = animalSpecies;
    }

    public String getCageAssignment() {
        return cageAssignment;
    }

    public void setCageAssignment(String cageAssignment) {
        this.cageAssignment = cageAssignment;
    }
}
