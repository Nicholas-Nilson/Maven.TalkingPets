package io.zipcoder.polymorphism;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class PetQ {

    Scanner interviewer = new Scanner(System.in);
    Integer numberOfPets = 0;
    ArrayList<Integer> typeOfPet = new ArrayList<Integer>();
    ArrayList<String> nameOfPet = new ArrayList<String>();

    public void petQuestionnaire() {
        System.out.println("How many pets do you have?");
        numberOfPets = interviewer.nextInt();
        while (numberOfPets < 0) {
            System.out.println("We consider pets positive around here. It's ok if you have zero, if not, tell us how many you have.");
            numberOfPets = interviewer.nextInt();
        }
         if (numberOfPets > 0) {
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
