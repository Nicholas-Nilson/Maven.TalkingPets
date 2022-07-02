package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class PetTest {

    @Test
    public void testDefaultPetConstructor() {
        //Given
        String expectedName = "Nemo";
        //When
        Pet pet = new Pet();
        //Then
        String actualName = pet.getPetName();

        Assert.assertEquals(expectedName, actualName);
    }
    @Test
    public void testPetConstructor() {
        //Given
        String expectedName = "Moose";
        //When
        Pet pet = new Pet("Moose");
        //Then
        String actualName = pet.getPetName();
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetPetName() {
        //Given
        String expectedName = "Chib";
        //When
        Pet pet = new Pet("Moose");
        pet.setPetName("Chib");
        //Then
        String actualName = pet.getPetName();
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testGetPetName() {
        //Given
        String expectedName = "Fiona";
        //When
        Pet pet = new Pet("Fiona");
        //Then
        String actualName = pet.getPetName();
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testPetSpeak() {
        //Given
        String expectedPetSpeak = "... what am I?!";
        String expectedDogSpeak = "bork bork";
        String expectedCatSpeak = "nyaaaaan";
        String expectedDuckSpeak = "QUACK";
        //When
        Pet pet = new Pet();
        Pet dog = new Dog();
        Pet cat = new Cat();
        Pet duck = new Duck();
        //Then
        String actualPetSpeak = pet.speak();
        String actualDogSpeak = dog.speak();
        String actualCatSpeak = cat.speak();
        String actualDuckSpeak = duck.speak();

        Assert.assertEquals(expectedPetSpeak, actualPetSpeak);
        Assert.assertEquals(expectedDogSpeak, actualDogSpeak);
        Assert.assertEquals(expectedCatSpeak, actualCatSpeak);
        Assert.assertEquals(expectedDuckSpeak, actualDuckSpeak);
    }
}