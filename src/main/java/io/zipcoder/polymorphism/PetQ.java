package io.zipcoder.polymorphism;

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

    public static void main(String[] args) {
    boolean petNum = true;
        //Number of Pets
        System.out.println("How many pets do you have?");
         while (petNum) {
             try {
                 numberOfPets = interviewer.nextInt();
             } catch (InputMismatchException e) {
                 System.out.println("Please enter a number.");
//                 numberOfPets = -1;
                 interviewer.next();
                 continue;
             }
             if (numberOfPets < 0) {
                 System.out.println("Please enter a non-negative number.");
                 continue;
             }
             petNum = false;
         }
        //Asking User to Specify Animal Types
        if (numberOfPets > 0){
        for (int i = 1; i <= numberOfPets; i++) {
            System.out.printf("What kind of animal is pet #%d?\n", i);
            System.out.println("Please Enter:");
            System.out.println("'1' for Dog");
            System.out.println("'2' for Cat");
            System.out.println("'3' for Duck");
            typeOfPet.add(interviewer.nextInt());
        }
        }

        //Asking User for Names of Pets. Can also create the pets here.

        int dogCount = 0;
        int catCount = 0;
        int duckCount =0;
        for (int pet : typeOfPet) {
            System.out.printf("What is pet #%d's name?\n", pet);
            nameOfPet.add(interviewer.next());
        }
        System.out.println(typeOfPet);
        System.out.println(nameOfPet);
    }
    }