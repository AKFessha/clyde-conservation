package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Validate {
        /*
         * VARIABLES - declare and initialise Scanner
         */
        public static Scanner sc = new Scanner(System.in);

        /*
         * CONSTRUCTOR - not needed as methods are all static
         * and no variables to intialise
         */
        public Validate() {

        }

        /*
         * Validate Integer method
         * Tries to scan nextLine() and parse input to Integer
         * Assigns to variable num
         * Returns num
         * Catches InputMismatchException
         */
        public static int validateInteger() {
            while(true) {
                try {
                    int num = Integer.parseInt(sc.nextLine());
                    return num;
                }
                catch(InputMismatchException e) {
                    sc.nextLine();
                    errorMessage("integer");
                    e.printStackTrace();
                }
            }
        }

        /*
         * Validate String method
         * Tries to scan nextLine()
         * Assigns to variable word
         * Returns word
         * Catches InputMismatchException
         */
        public static String validateString() {
            while(true) {
                try {
                    String word = sc.nextLine();
                    return word;
                } catch (InputMismatchException e) {
                    sc.nextLine();
                    errorMessage("string");
                    e.printStackTrace();
                }
            }
        }

        /*
         * ID Generator method
         * Takes String prefix as parameter
         * Prefix for Cage is CG
         * Prefix for Keeper is KP
         * Prefix for Animal is species.substring(0, 2).toUpperCase();
         * Generates a random number between 0 and 1 and multiplies it
         * by 1000 - giving a random number between 0 and 999
         * Sets id to prefix + random number
         * Returns id
         */
        public static String idGenerator(String prefix) {
            int random = (int)Math.ceil(Math.random() * 1000);
            String id = prefix + random;
            return id;
        }

        /*
         * Validate Cage Type method
         * Takes Cage and Animal objects as parameters
         * Checks if Cage type is "None" - returns true
         * Else checks if animalCompatibility is true (see below) - returns true
         * Else returns false
         */
        public static boolean validateCageType(Cage cage, Animal animal) {
            if(cage.getCageType().equals("None")) {
                return true;
            } else if(animalCompatibility(cage.getCageType(), animal.getAnimalSpecies())) {
                return true;
            }
            return false;
        }

        /*
         * Animal Compatibility method
         * Takes String type and species as parameters (from above method)
         * Checks if Type is equal to Species - return true
         * Checks if Type is a sharing species, if compatible - return true
         * Else, returns false
         */
        public static boolean animalCompatibility(String type, String species) {
            if(type.equals(species + "s")){
                return true;
            } else if(type.equals("Zebras and Marmoset Monkeys")) {
                if(species.equals("Zebra") || species.equals("Marmoset-Monkey")) {
                    return true;
                } else {
                    return false;
                }
            } else if(type.equals("Rabbits and Guinea Pigs")) {
                if(species.equals("Rabbit") || species.equals("Guinea-Pig")) {
                    return true;
                } else {
                    return false;
                }
            } else if(type.equals("Horses and Donkeys")) {
                if(species.equals("Horse") || species.equals("Donkey")) {
                    return true;
                } else {
                    return false;
                }
            } else if(type.equals("Bearded Dragons and Lizards")) {
                if(species.equals("Bearded-Dragon") || species.equals("Lizard")) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        public static BufferedReader checkFile(String pathAndFile) {
            System.out.println(pathAndFile);
            BufferedReader in = null;

            try {
                in = new BufferedReader(new FileReader(new File(pathAndFile)));
                System.out.println("File exists\n");
            } catch (FileNotFoundException var3) {
                System.out.println("The file doesn't exist.\n");
                System.exit(0);
            }

            return in;
        }

        /*
         * Error Message method
         * Takes String ref as parameter
         * Prints error message based on ref
         * Flush System.out
         */
        public static void errorMessage(String ref) {
            System.err.println("Invalid " + ref + ", please try again");
            System.out.flush();
        }

    }


