package io.zipcoder.polymorphism;

public class Console {

    private Integer numberOfPets = StableBuilder.numberData.size(); // to display "you have # pet(s)!"
    private Integer petNumber; //these two for when iterating through array to get pet info for interaction.
    private String petName;
    private boolean powerState;

    public enum FSM {
        Ready,
        Interact;
    }

    private FSM currentState;

    //Starting Up
    public void operate() {
        currentState = FSM.Ready;
        powerState = true;
        while (powerState) {
            if (currentState == FSM.Ready) {
                if (numberOfPets == 0) {
                    System.out.println("[+] to add a pet | [q] to quit");
                    System.out.println("You have %d pets!");
                }
                if (numberOfPets > 0) {
                    System.out.println("[+] to add a pet | [i] to interact");
                }
            } else if (currentState == FSM.Interact) {}
        }
    }


}
