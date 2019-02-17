package com.company;

import java.util.LinkedList;

public class Cage {
    private String cageID;
    private String cageSize;
    private String cageType;
    private int maxAnimal;
    private int maxKeepers;
    private LinkedList<Animal> cagedAnimals;
    private LinkedList<Keeper> cagedKeepers;

    // Constructors
    public Cage(){

    }
    public Cage(String cageID, String cageSize, String cageType, int maxAnimal, int maxKeepers) {
        this.cageID = cageID;
        this.cageSize = cageSize;
        this.cageType = cageType;
        this.maxAnimal = maxAnimal;
        this.maxKeepers = maxKeepers;
    }


    // Getters and Setters

    public String getCageID() {
        return cageID;
    }

    public void setCageID(String cageID) {
        this.cageID = cageID;
    }

    public String getCageSize() {
        return cageSize;
    }

    public void setCageSize(String cageSize) {
        this.cageSize = cageSize;
    }

    public String getCageType() {
        return cageType;
    }

    public void setCageType(String cageType) {
        this.cageType = cageType;
    }

    public int getMaxAnimal() {
        return maxAnimal;
    }

    public void setMaxAnimal(int maxAnimal) {
        this.maxAnimal = maxAnimal;
    }

    public int getMaxKeepers() {
        return maxKeepers;
    }

    public void setMaxKeepers(int maxKeepers) {
        this.maxKeepers = maxKeepers;
    }

    public LinkedList<Animal> getCagedAnimals() {
        return cagedAnimals;
    }

    public void setCagedAnimals(LinkedList<Animal> cagedAnimals) {
        this.cagedAnimals = cagedAnimals;
    }

    public LinkedList<Keeper> getCagedKeepers() {
        return cagedKeepers;
    }

    public void setCagedKeepers(LinkedList<Keeper> cagedKeepers) {
        this.cagedKeepers = cagedKeepers;
    }
}
