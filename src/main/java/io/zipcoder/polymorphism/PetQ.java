package io.zipcoder.polymorphism;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class PetQ {

    //Should I have a method to fill in the variables? Or ... idk.. we're just trying to get the information here!
    private static Scanner interviewer = new Scanner(System.in);
    public static Integer numberOfPets;
    public static ArrayList<Integer> typeOfPet = new ArrayList<Integer>();
    public static ArrayList<String> nameOfPet = new ArrayList<String>();

    public static void main(String[] args){
        System.out.println("How many pets do you have?");
        numberOfPets = interviewer.nextInt();
        while (numberOfPets < 0) {
            System.out.println("We consider pets positive around here. It's ok if you have zero, if not, tell us how many you have.");
            numberOfPets = interviewer.nextInt();
        }
        if (numberOfPets > 0){
        for (int i = 1; i <= numberOfPets; i++) {
            System.out.printf("What is the name of pet #%d?\n", i);
            System.out.println("Please Enter:");
            System.out.println("'1' if it's a Dog");
            System.out.println("'2' if it's Cat");
            System.out.println("'3' if it's Duck");
            typeOfPet.add(interviewer.nextInt());
        }
        }
    }
    }