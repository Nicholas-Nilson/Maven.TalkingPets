package io.zipcoder.polymorphism;

//notes added for my own understanding.

public class Pet {

    private String name;
    private String petSounds;

    public Pet() {
        this.name = ""; //will update w/ generic names per sub-class.
    }

    public void setPetName(String name) {
        this.name = name;
    }

    //for example. when we call dog1.getPetName(); it will get the name associated w/ dog.
    public String getPetName() {
        return name;
    }

    public String petSpeak(Pet type) { // take another look at this
        return type.petSounds;
    }

}


