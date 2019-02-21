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


    /*
     * Write Cage Details method
     * Takes ArrayList<Cage> as parameter
     * Initialise FileWriter with the Cage File
     * Initlaise PrintWriter with FileWriter
     * Loop through Cage ArrayList and (if != null)
     * Write all Cage attributes to Cage File
     * Flush PrintWriter when complete
     */
    public void writeCageDetails(ArrayList<Cage> cageList) {
        try {
            write = new FileWriter(cageFile);
            out = new PrintWriter(write);

            for (Cage i : cageList) {
                if (cageList != null) {
                    out.write(i.getCageID() + ",");
                    out.write(i.getCageSize() + ",");
                    out.write(i.getCageType() + ",");
                    out.write(i.getMaxAnimal() + ",");
                    out.write(i.getMaxKeepers() + "\n");
                }
            }
            out.flush();
        } catch (IOException e) {
            System.err.println("Invalid path");
            e.printStackTrace();
        }
    }

    /*
     * Write Keeper Details method
     * Takes ArrayList<Keeper> as parameter
     * Initialise FileWriter with the Keeper File
     * Initlaise PrintWriter with FileWriter
     * Loop through Keeper ArrayList and (if != null)
     * Write all Keeper attributes to Keeper File
     * Another loop is needed to write CageAssignments
     * Flush PrintWriter when complete
     */
    public void writeKeeperDetails(ArrayList<Keeper> keeperList) {
        try {
            write = new FileWriter(keeperFile);
            out = new PrintWriter(write);

            for(Keeper i : keeperList) {
                if(keeperList != null) {
                    out.write(i.getKeeperId() + ",");
                    out.write(i.getFirstName() + ",");
                    out.write(i.getLastName() + ",");
                    out.write(i.getCageAssignment()+"\n");
                }
            }
            out.flush();
        } catch(IOException e) {
            System.err.println("Invalid path");
            e.printStackTrace();
        }
    }


}
