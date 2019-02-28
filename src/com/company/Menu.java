package com.company;

import java.io.IOException;
import java.util.InputMismatchException;

/*
 * CONSTRUCTOR
 * Initialise Collection object
 */
public class Menu {
Collection col;
public Menu() throws IOException {
   col = new Collection();
}

    /*
     * Main menu processor method to accept user input
     * and direct to appropriate section of program
     * Prints the main menu options
     */
public void menuProcessor(){
    int choice;
    while(true){
        try {
            displayMainMenu();
            System.out.println("Please enter your choice from the menu:");
            choice = Validate.validateInteger();

            switch (choice) {
                case 1:
                    col.displayAllEnclosures();
                    break;

                case 2:
                    col.displayAllCages();
                    break;

                case 3:
                    col.addCage();
                    break;
                case 4:
                    col.displayAllAnimals();
                    break;
                case 5:
                    col.addAnimal();
                    System.out.println("Now lets assign the animal to a Cage....");
                    col.assignAnimalCage();
                    break;
                case 6:
                    col.removeAnimal();
                    break;
                case 7:
                    col.displayAllKeepers();
                    break;
                case 8:
                    col.addKeeper();
                    break;
                case 9:
                    col.assignKeeperCage();
                    break;
                case 10:
                    col.removeKeeper();
                    break;
                case 11:
                    col.saveData();
                    System.out.println("Saved");
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    Validate.errorMessage("selection");
                    break;

            }
        }
        catch(NumberFormatException e){
               Validate.errorMessage("input");
                menuProcessor();
        }

    }
}

//Method for printing main menu
    public void displayMainMenu(){
        System.out.println("1. List all available Enclosures");
        System.out.println("2. List all available Cages with their Animals and Keepers");
        System.out.println("3. Add a new Cage");
        System.out.println("4. List all available Animals ");
        System.out.println("5. Add new Animal and assign it to Cage");
        System.out.println("6. Unassign Animal from Cage");
        System.out.println("7. List all available Keepers");
        System.out.println("8. Add a new Keeper");
        System.out.println("9. Assign keeper to cage");
        System.out.println("10. Unassign Keeper from Cage");
        System.out.println("11. Save all the current details and exit");
    }
}
