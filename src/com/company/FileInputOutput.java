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

    /*
     * Read Animal Data method
     * Takes ArrayList<Animal> as parameter
     * Initialise FileReader with Animal File
     * Initialise Scanner with FileReader
     * Create new Animal Object
     * Read through Animal File and Scan each line
     * Set Animal attributes to these inputs
     * Add Animal to Animal ArrayList
     */
    public void readAnimalData(ArrayList<Animal> animalList) throws IOException {

        BufferedReader in =Validate.checkFile(pathToAnimalFile); //check if the file exists
        String str;
        while ((str = in.readLine()) != null) {
            animalList.add(populateAnimalDetails(str));
        }
        in.close();
    }

    private static Animal populateAnimalDetails(String str) {
        String[] data;
        if (str == null) {
            return null;
        } else {
            //the content, str.split(",") returns an array[] of strings separated by a tab
            data = str.split(",");
            return new Animal(data[0], data[1], data[2], data[3], data[4]);
        }
    }

    /*
     * Read Cage Data method
     * Takes ArrayList<Cage> as parameter
     * Initialise FileReader with Cage File
     * Initialise Scanner with FileReader
     * Create new Cage Object
     * Read through Cage File and Scan each line
     * Set Cage attributes to these inputs separated by comma using pouplateCageDetails and
     * Add Cage to Cage ArrayList
     */
    public void readCageData(ArrayList<Cage> cageList) throws IOException {
        BufferedReader in =Validate.checkFile(pathToCageFile); //check if the file exists
        String str;
        while ((str = in.readLine()) != null) {
            cageList.add(populateCageDetails(str));
        }
        in.close();

    }

    //Populate a Cage from a String passed by using the split method and return the Cage
    private static Cage populateCageDetails(String str) {
        String[] data;
        if (str == null) {
            return null;
        } else {
            //the content, str.split(",") returns an array[] of strings separated by a tab
            data = str.split(",");
            return new Cage(data[0], data[1], data[2], Integer.parseInt(data[3]), Integer.parseInt(data[4]));
        }
    }


}
