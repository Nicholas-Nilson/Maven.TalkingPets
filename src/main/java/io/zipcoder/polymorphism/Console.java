package io.zipcoder.polymorphism;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Console {

    private Integer petNumber;      // to display "you have # pet(s)!"
    private Integer numberOfPets = StableBuilder.numberData.size(); //these two for when iterating through array to get pet info for interaction.
//    private String petName;
    private String[] petTypes = {"Dog", "Cat", "Duck"};
    private boolean powerState;
    private Scanner commandInput = new Scanner(System.in);

    public enum FSM {
        Home,
        Interact;
    }

    private FSM currentState;

    //Starting Up
    public void operate() {
        currentState = FSM.Home;
        powerState = true;
        while (powerState) {
            String command = "";
            if (currentState == FSM.Home) {
                if (numberOfPets == 0) {
                    System.out.printf("You have %d pets!\n", numberOfPets);
                    System.out.println("[+] to add a pet | [q] to quit");
                    command = commandInput.nextLine();
                    switch (command) {
                        case "+":
                            StableBuilder.getPet();
                            numberOfPets++;
                            break;
                        case "q":
                            powerState = false;
                            System.out.println("Good Bye!");
                            break;
                        default:
                            System.out.println("Please enter a valid command\n");
                    }

                }
                if (numberOfPets > 0) {
                    System.out.printf("You have %d pet(s)!\n", numberOfPets);
                    for (int i = 0; i < numberOfPets; i++) {  //this code can be refactored.
                        System.out.printf("%s the %s\n", StableBuilder.nameData.get(i), petTypes[StableBuilder.typeData.get(i)]);
                    }
                    System.out.println("[+] to add a pet | [i] to interact | [q] to quit");
                    command = commandInput.nextLine();
                    switch (command) {
                        case "+":
                            StableBuilder.getPet();
                            numberOfPets++;
                            break;
                        case "q":
                            powerState = false;
                            System.out.println("Good Bye!");
                            break;
                        case "i":
                            currentState = FSM.Interact;
                            break;
                        default:
                            System.out.println("Please enter a valid command\n");
                    }
                }
            } else if (currentState == FSM.Interact) {     //whew, we're getting there.
//                for (int i = 0; i < numberOfPets; i++) { //prints names of pets at top of interact menu, but adds clutter.
//                    System.out.printf("%s the %s\n", StableBuilder.nameData.get(i), petTypes[StableBuilder.typeData.get(i)]);
//                }
                System.out.println("[s] to ask a pet to speak | [r] to return to the main menu | [q] to quit");
                command = commandInput.next();
                switch (command) {
                    case "s":
                        Integer petChoice = null;
                        boolean gotPetChoice = false;
                        while (!gotPetChoice) { //to find type of pet by index aligned index number)
                            for (int i = 0; i < numberOfPets; i++) {
                                System.out.printf("[%d] for %s the %s\n", i + 1, StableBuilder.nameData.get(i), petTypes[StableBuilder.typeData.get(i)]);
                            }
                            try {
                                petChoice = commandInput.nextInt();
                            } catch (InputMismatchException e) {
                                System.out.println("Please enter a correct option.");
                                commandInput.next();
                                continue;
                            } if (petChoice < 0 || petChoice > StableBuilder.numberData.size()) {
                                System.out.println(("Please enter a correct option."));
                                continue;
                            }
                            gotPetChoice = true;
                            petChoice = petChoice -1; //to align with index #s of Data lists.
                        } while(gotPetChoice) {
                        switch (StableBuilder.typeData.get(petChoice)) {
                            case 0:
                                Pet dog = new Dog();
                                dog.setPetName(StableBuilder.nameData.get(petChoice));
                                System.out.printf("%s says %s!\n", dog.getPetName(), dog.speak());
                                gotPetChoice = false;
                                break;
                            case 1:
                                Pet cat = new Cat();
                                cat.setPetName(StableBuilder.nameData.get(petChoice));
                                System.out.printf("%s says %s!\n", cat.getPetName(), cat.speak());
                                gotPetChoice = false;
                                break;
                            case 2:
                                Pet duck = new Duck();
                                duck.setPetName(StableBuilder.nameData.get(petChoice));
                                System.out.printf("%s says %s!\n", duck.getPetName(), duck.speak());
                                gotPetChoice = false;
                                break;
                            default:
                                System.out.println("Please enter a valid command");
                        }
                    }

                        break;
                        case "q":
                            powerState = false;
                            System.out.println("Good Bye!");
                            break;
                        case "r":
                            currentState = FSM.Home;
                            break;
                        default:
                            System.out.println("Please enter a valid option4\n");
                            continue;
                    }
                        }
            }
        }
    }



