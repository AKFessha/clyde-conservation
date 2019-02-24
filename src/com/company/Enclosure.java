package com.company;

import java.util.LinkedList;

public class Enclosure {
    private String suitability;
    private int numberOfCages;
    private int numberOfKeepers;
    private LinkedList<Cage> enclosedCages;

     //Constructors
    public Enclosure(){

    }

    public Enclosure(String suitability, int numberOfCages, int numberOfKeepers) {
        enclosedCages= new LinkedList<>();
        this.suitability = suitability;
        this.numberOfCages = numberOfCages;
        this.numberOfKeepers = numberOfKeepers;
    }

    //Getters and setters
    public String getSuitability() {
        return suitability;
    }

    public void setSuitability(String suitability) {
        this.suitability = suitability;
    }

    public int getNumberOfCages() {
        return numberOfCages;
    }

    public void setNumberOfCages(int numberOfCages) {
        this.numberOfCages = numberOfCages;
    }

    public int getNumberOfKeepers() {
        return numberOfKeepers;
    }

    public void setNumberOfKeepers(int numberOfKeepers) {
        this.numberOfKeepers = numberOfKeepers;
    }

    public LinkedList<Cage> getEnclosedCages() {
        return enclosedCages;
    }

    public void setEnclosedCages(LinkedList<Cage> enclosedCages) {
        this.enclosedCages = enclosedCages;
    }
}
