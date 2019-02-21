package com.company;

import java.io.IOException;
import java.util.ArrayList;

public class Collection {

    /*
     * VARIABLES
     * ArrayList for all Enclosures/ Cages / Animals / Keepers declared
     * FileInputOutput object declared
     */
    private ArrayList<Cage> allCages;
    private ArrayList<Animal> allAnimals;
    private ArrayList<Keeper> allKeepers;
    private ArrayList<Enclosure> allEnclosures;
    private FileInputOutput data;

    /*
     * CONSTRUCTOR
     * Initialise all arrayLists
     * Instantiate FileInputOutput object
     * Call readData() method to populate data structures from
     * text file data
     * Collection object instantiated on program start so data is
     * automatically read
     */

    public Collection() throws IOException {
        allCages = new ArrayList<>();
        allAnimals = new ArrayList<>();
        allKeepers= new ArrayList<>();
        allEnclosures= new ArrayList<>();
        data = new FileInputOutput();
        readData();
    }

    /*
     * Display Animal Details method
     * Takes a Animal object as parameter
     * Prints all details for that Animal
     * Formatted for readability
     */
    public void displayAnimalDetails(Animal animal) {
        System.out.println("Animal ID: " + animal.getAnimalID());
        System.out.println("Animal Name: " + animal.getAnimalName());
        System.out.println("Animal Family: " + animal.getAnimalFamily());
        System.out.println("Animal Species: " + animal.getAnimalSpecies());
        System.out.println("Cage: " + animal.getCageAssignment() + "\n");
    }


    /*
     * Search ID method
     * Takes in String of type as parameter
     * type defines what type of ID is being searched for
     * Variable id reads user input
     * returns id
     */
    public String searchId(String type) {
        System.out.println("Please enter " + type + " ID: ");
        String id = Validate.sc.nextLine();
        return id;
    }

    /*
     * Save Data method
     * Passes each ArrayList to their respective
     * write details method in FileInputOutput class
     */
    public void saveData() {
        data.writeAnimaDetails(allAnimals);
        data.writeKeeperDetails(allKeepers);
        data.writeCageDetails(allCages);

    }

    /*
     * Read Data method
     * Passes each ArrayList to their respective
     * read data method in FileInputOutput class
     * ArrayLists in Cage class also defined here
     * after main ArrayLists are populated
     */
    public void readData() throws IOException {
        data.readAnimalData(allAnimals);
        data.readKeeperData(allKeepers);
        data.readCageData(allCages);
        data.readEnclosureData(allEnclosures);
        for(Cage cage : allCages) {
            for(Animal animal : allAnimals) {
                if(animal.getCageAssignment().equals(cage.getCageID())) {
                    cage.getCagedAnimals().add(animal);
                }
            }
            for(Keeper keeper : allKeepers) {
                if(keeper.getCageAssignment().contains(cage.getCageID())) {
                    cage.getCagedKeepers().add(keeper);
                }
            }
        }
    }
    //Getters and setters

    public ArrayList<Cage> getAllCages() {
        return allCages;
    }

    public void setAllCages(ArrayList<Cage> allCages) {
        this.allCages = allCages;
    }

    public ArrayList<Animal> getAllAnimals() {
        return allAnimals;
    }

    public void setAllAnimals(ArrayList<Animal> allAnimals) {
        this.allAnimals = allAnimals;
    }

    public ArrayList<Keeper> getAllKeepers() {
        return allKeepers;
    }

    public void setAllKeepers(ArrayList<Keeper> allKeepers) {
        this.allKeepers = allKeepers;
    }

    public ArrayList<Enclosure> getAllEnclosures() {
        return allEnclosures;
    }

    public void setAllEnclosures(ArrayList<Enclosure> allEnclosures) {
        this.allEnclosures = allEnclosures;
    }
}
