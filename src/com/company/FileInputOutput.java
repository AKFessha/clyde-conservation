package com.company;
import java.io.*;
import java.util.ArrayList;
/*
 * Awet Fessha
 * Clyde conservation program
 * 2002/19
 * FileInputOutput Class
 */


public class FileInputOutput {


    /*
     * VARIABLES - declare all utilities and files to be used
     */
    private File animalFile;
    private File cageFile;
    private File keeperFile;
    private File enclosureFile;
    private FileWriter write;
    private PrintWriter out;

    /*
     * CONSTRUCTOR - intialise all 4 files
     */
    private String pathToAnimalFile = "Data/animalData.txt";
    private String pathToCageFile ="Data/cageData.txt";
    private String pathToKeeperFile= "Data/keeperData.txt";
    private String pathToEnclosureFile = "Data/enclosureData.txt";

    public FileInputOutput() {
        this.animalFile = new File(pathToAnimalFile);
        this.cageFile = new File(pathToCageFile);
        this.keeperFile = new File(pathToKeeperFile);
        this.enclosureFile = new File(pathToEnclosureFile);

    }

    /*
     * Write Animal Details method
     * Takes ArrayList<Animal> as parameter
     * Initialise FileWriter with the Animal File
     * Initlaise PrintWriter with FileWriter
     * Loop through Animal ArrayList and (if != null)
     * Write all Animal attributes to Animal File
     * Flush PrintWriter when complete
     */
    public void writeAnimaDetails(ArrayList<Animal> animalList) {
        try {
            write = new FileWriter(animalFile);
            out = new PrintWriter(write);

            for (Animal i : animalList) {
                if (animalList != null) {
                    out.write(i.getAnimalID() + ",");
                    out.write(i.getAnimalName() + ",");
                    out.write(i.getAnimalFamily() + ",");
                    out.write(i.getAnimalSpecies() + ",");
                    out.write(i.getCageAssignment() + "\n");
                }
            }
            out.flush();
        } catch (IOException e) {
            System.err.println("Invalid path");
            e.printStackTrace();
        }
    }

}
