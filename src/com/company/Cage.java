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

    /*
     * Assign Animal method
     * Takes a Cage and Animal object as parameters
     * Checks if Cage is full
     * Checks if Animal already exists in Cage
     * Checks Animal is valid species for Cage type
     * Adds Animal to Cage, sets Cage type (if "None"),
     * sets Animal CageAssignment
     * Prints confirmation to user
     */
    public void assignAnimal(Cage cage, Animal animal) {

        if (cage.cagedAnimals.size() >= cage.getMaxAnimal()) {
            System.err.println("This cage is full");
        } else if (cage.cagedAnimals.contains(animal)) {
            System.err.println("This animal is already in this cage");
        } else if (!Validate.validateCageType(cage, animal)) {
            System.err.println("This animal can't go in this cage");
        } else {
            cage.cagedAnimals.add(animal);
            if (cage.getCageType().equals("None")) {
                cage.defineCageType(cage, animal);
            }
            animal.setCageAssignment(cage.getCageID());
            System.out.println(animal.getAnimalName() + " the " + animal.getAnimalSpecies() + " was successfully added to cage " + cage.getCageID());
        }
    }

    /*
     * Define Cage Type method
     * Takes Cage and Animal object as parameters
     * Checks if species can share
     * If they can share, set type to species1 and species2
     * If not, set type to species
     */
    public void defineCageType(Cage cage, Animal animal) {
        if(animal.getAnimalSpecies().equals("Zebra") || animal.getAnimalSpecies().equals("Marmoset-Monkey")) {
            cage.setCageType("Zebras and Marmoset Monkeys");
        } else if(animal.getAnimalSpecies().equals("Rabbit") || animal.getAnimalSpecies().equals("Guinea-Pig")) {
            cage.setCageType("Rabbits and Guinea Pigs");
        } else if(animal.getAnimalSpecies().equals("Horse") || animal.getAnimalSpecies().equals("Donkey")) {
            cage.setCageType("Horses and Donkeys");
        } else if(animal.getAnimalSpecies().equals("Bearded-Dragon") || animal.getAnimalSpecies().equals("Lizard")) {
            cage.setCageType("Bearded Dragons and Lizards");
        } else {
            cage.setCageType(animal.getAnimalSpecies() + "s");
        }
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
