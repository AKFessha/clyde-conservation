package com.company;

import java.util.LinkedList;

public class Enclosure {
    private String suitability;
    private int numberOfCages;
    private int numberOfKeepers;
    private LinkedList<Enclosure> enclosedCages;



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

    public LinkedList<Enclosure> getEnclosedCages() {
        return enclosedCages;
    }

    public void setEnclosedCages(LinkedList<Enclosure> enclosedCages) {
        this.enclosedCages = enclosedCages;
    }
}
