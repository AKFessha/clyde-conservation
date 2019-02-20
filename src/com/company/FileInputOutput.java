package com.company;

import java.io.File;
import java.io.PrintWriter;
import java.io.Writer;
import java.nio.file.Path;

public class FileInputOutput {


    private File animalFile;
    private File cageFile;
    private File keeperFile;
    private File enclosureFile;
    private Writer write;
    private PrintWriter out;
    private String pathToAnimalFile= "Data/animalData.txt";
    private String pathToKeeperFile= "Data/keeperData.txt";
    private String pathToCageFile= "Data/cageData.txt";
    private String pathToEnclosureFile= "Data/enclosureData.txt";


    public FileInputOutput() {
        animalFile= new File(pathToAnimalFile);
        cageFile= new File(pathToCageFile);
        keeperFile= new File(pathToKeeperFile);
        enclosureFile= new File(pathToEnclosureFile);
    }
}
