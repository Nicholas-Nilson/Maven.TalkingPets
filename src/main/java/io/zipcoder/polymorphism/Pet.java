package io.zipcoder.polymorphism;

//notes added for my own understanding.

public class Pet {

    //Instance Variables
    private String name;

    public Pet() {
        this.name = ""; //will update w/ generic names per sub-class.
    }

    //Constructor
    public Pet(String name) {
        this.name = name;
    }

    public void setPetName(String name) {
        this.name = name;
    }

    //for example. when we call dog1.getPetName(); it will get the name associated w/ dog.
    public String getPetName() {
        return name;
    }

    public String speak() {
        // take another look at this;
        return "...";
    }

}


