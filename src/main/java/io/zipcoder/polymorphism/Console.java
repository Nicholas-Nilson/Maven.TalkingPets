package io.zipcoder.polymorphism;

import java.util.Scanner;

public class Console {

    private Integer petNumber;      // to display "you have # pet(s)!"
    private Integer numberOfPets = StableBuilder.numberData.size(); //these two for when iterating through array to get pet info for interaction.
//    private String petName;
    private String[] petTypes = {"dog", "cat", "duck"};
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
                    for (int i = 0; i < numberOfPets; i++) {
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

            }
        }
    }


}
