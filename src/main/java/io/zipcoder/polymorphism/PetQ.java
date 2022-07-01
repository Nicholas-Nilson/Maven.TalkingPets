package io.zipcoder.polymorphism;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PetQ {

    //Should I have a method to fill in the variables? Or ... idk.. we're just trying to get the information here!
    private static Scanner interviewer = new Scanner(System.in);
    public static Integer numberOfPets = -1;
    public static ArrayList<Integer> typeOfPet = new ArrayList<Integer>();
    public static ArrayList<String> nameOfPet = new ArrayList<String>();
    public static boolean gotPetNumber = false;
    public static boolean petQComplete = false;
    private static String[] instructions = {"How many pets do you have?", "Please select type of pet", "What are their names?"};

//    public static void inputCheck(int varToUpdate, String instruct) {
//        boolean notNumber = true;
//        while (notNumber) {
//            System.out.println(instruct);
//            try {
//                varToUpdate = interviewer.nextInt();
//                notNumber = false;
//            } catch (InputMismatchException e) {
//                System.out.println("Please enter a number.");
//                interviewer.next();
//                continue;
//            }
//            if (varToUpdate < 0) {
//                System.out.println("Please enter a non-negative number.");
//                continue;
//            }
//            notNumber = false;
//        }
//    }

    // public static void main(String[] args) {
    public static void createPetStable() {

        //Number of Pets
         boolean gotPetNumber = false;
         while (!gotPetNumber) {
             System.out.println("How many pets do you have?");
             try {
                 numberOfPets = interviewer.nextInt();
             } catch (InputMismatchException e) {
                 System.out.println("Please enter a number.");
                 interviewer.next();
                 continue;
             }
             if (numberOfPets < 0) {
                 System.out.println("Please enter a non-negative number.");
                 continue;
             }  //needs a way to end the program if the user enters 0 pets.
             gotPetNumber = true;
         }

        //Asking User to Specify Animal Types

     if (numberOfPets > 0) {
//         Integer[] typeOfPet = new Integer[numberOfPets]; //if changing code to methods, figure out how to define this.
         for (int i = 1; i <= numberOfPets; i++) {
             boolean gotPetType = false;
             int petType;
             while (!gotPetType) {
                 System.out.printf("What kind of animal is pet #%d?\n", i);
                System.out.println("Please Enter:");
                System.out.println("'1' for Dog");
                System.out.println("'2' for Cat");
                System.out.println("'3' for Duck");
                try {
                    petType = interviewer.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Please enter a number.");
                    interviewer.next();
                    continue;
                } if (petType <= 0 || petType > 3) {
                     System.out.println("Please enter a correct option.");
                     continue;
                 }
                gotPetType = true;
                typeOfPet.add(petType);
                System.out.println(i);
                }
         }
     }

        //Asking User for Names of Pets. Can also create the pets here.

        int dogCount = 0;
        int catCount = 0;
        int duckCount = 0;
        for (int i = 1; i <= numberOfPets; i++) {
            System.out.printf("What is pet #%d's name?\n", i);
            nameOfPet.add(interviewer.next());
        }
        System.out.println(typeOfPet);
        System.out.println(nameOfPet);
        petQComplete = true;
    }
    public static void main(String[] args) {}
}