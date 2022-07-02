package io.zipcoder.polymorphism;

//here I will have methods to create new pets.

//goal is to store 3 variables. one to count how many pets there currently are. two more to designate type of animal & their name.

import java.util.*;
import java.util.Scanner;

public class StableBuilder {

    //Instance Variables
    public static Integer numberOfPets = 0;
//    private int petType;
//    private String petName;
//    Map<Integer,String> petMap = new HashMap<Integer,String>();
  //  List<List<String>> stable = new ArrayList<List<String>>(); //ArrayList of ArrayLists that holds a string. x = pet, y = values.
    public static ArrayList<Integer> numberData = new ArrayList<Integer>();
    public static ArrayList<Integer> typeData = new ArrayList<Integer>();
    public static ArrayList<String> nameData = new ArrayList<String>();
    static Scanner interviewer = new Scanner(System.in);

    //Constructor  - shouldn't be necessary? Utility class to create animals.

    //Method for creating animals..

    //will use a switch case for type of pet.
    public static void getPet() {


            boolean gotNumPetsToAdd = false;
            int numberOfPetsToAdd = 0;
            while (!gotNumPetsToAdd) {
                System.out.println("How many pets would you like to add?");
                try {
                    numberOfPetsToAdd = interviewer.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Please enter a number.");
                    interviewer.next();
                    continue;
                }
                gotNumPetsToAdd = true;
                numberOfPets = numberOfPets + numberOfPetsToAdd;
            }
            for (int i = 0; i < numberOfPetsToAdd; i++) {
                boolean gotPetType = false;
                int petType;
                while (!gotPetType) {
                    System.out.printf("What kind of animal is pet #%d?\n", numberOfPets + 1);
                    System.out.println("Please Enter:");
                    System.out.println("[1] for Dog");
                    System.out.println("[2] for Cat");
                    System.out.println("[3] for Duck");
                    System.out.println("[4] for ???");
                    try {
                        petType = interviewer.nextInt();
                        numberData.add(numberOfPets);
                    } catch (InputMismatchException e) {
                        System.out.println("Please enter a number.");
                        interviewer.next();
                        continue;
                    }
                    if (petType <= 0 || petType > 4) {
                        System.out.println("Please enter a correct option.");
                        int lastIndex = numberData.size() - 1;
                        numberData.remove(lastIndex);
                        continue;
                    }
                    gotPetType = true;
                    typeData.add(petType - 1);
                }
                System.out.println(("What is the name of this fine creature?"));
                nameData.add(interviewer.next());

                System.out.println(numberOfPets);
                System.out.println(numberData);
                System.out.println((typeData));
                System.out.println((nameData));
            }
    }
}


