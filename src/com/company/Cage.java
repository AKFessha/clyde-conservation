package com.company;

import java.util.InputMismatchException;
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
      cagedAnimals= new LinkedList<>();
      cagedKeepers= new LinkedList<>();
    }
    public Cage(String cageID, String cageSize, String cageType, int maxAnimal, int maxKeepers) {
        this.cageID = cageID;
        this.cageSize = cageSize;
        this.cageType = cageType;
        this.maxAnimal = maxAnimal;
        this.maxKeepers = maxKeepers;
    }

    /*
     * New Cage method
     * Takes a blank Cage object as parameter
     * Prompts user to enter Cage details
     * Assigns these inputs to Keeper attributes with
     * setters
     * Switch used to set Cage size, maxAnimal, and maxKeeper, based
     * on choice, and ID is automatically generated
     * Cage Type set to "None" as default
     * Returns Cage object
     */

    public Cage newCage(Cage cage) {
        String size = "";
        int maxAnimal = 0;
        int maxKeeper = 0;
        boolean noError = true;
        while (noError) {
            try {
                System.out.println("Please enter cage size: ");
                cageSizeMenu();
                int choice = Validate.validateInteger();
                switch (choice) {
                    case 1:
                        size = "Small";
                        maxAnimal = 2;
                        maxKeeper = 1;
                        break;
                    case 2:
                        size = "Medium";
                        maxAnimal = 4;
                        maxKeeper = 2;
                        break;
                    case 3:
                        size = "Large";
                        maxAnimal = 8;
                        maxKeeper = 3;
                        break;
                    case 4:
                        size = "Extra-Large";
                        maxAnimal = 16;
                        maxKeeper = 4;
                        break;
                    default:
                        Validate.errorMessage("selection");
                        newCage(cage);

                }
            } catch (InputMismatchException e) {
                Validate.errorMessage("input");
                newCage(cage);
            }
            if (noError) {
                break;
            }

        }
        cage.setCageID(Validate.idGenerator("CG"));
        cage.setCageSize(size);
        cage.setCageType("None");
        cage.setMaxAnimal(maxAnimal);
        cage.setMaxKeepers(maxKeeper);
        return cage;


    }

    /*
     * Cage Size Menu method
     * Prints the different Cage sizes available
     * Also prints corresponding animal/keeper limits
     * for each size
     * Used in New Cage method
     */

public void cageSizeMenu(){
    System.out.println("\t1. Small (2 Animals, 1 Keeper)");
    System.out.println("\t2. Medium (4 Animals, 2 Keeper)");
    System.out.println("\t3. Large (8 Animals, 3 Keeper)");
    System.out.println("\t4. Extra-Large (16 Animals, 4 Keeper)");
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
