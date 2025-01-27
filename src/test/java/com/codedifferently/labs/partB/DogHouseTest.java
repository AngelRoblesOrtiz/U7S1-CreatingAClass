package com.codedifferently.labs.partB;

import org.junit.jupiter.api.Assertions;
import partB.animals.Dog;
import partB.storage.DogHouse;
import java.util.Date;

public class DogHouseTest {
    public static void main(String[] args) {
        //Testing add
        String name = "Sparky";
        Date date = new Date();
        Dog dog = new Dog(name, date, 1);
        DogHouse.add(dog);
        Dog retrievedDog = DogHouse.getDogById(1);
        Assertions.assertEquals(dog.getName(), retrievedDog.getName());
        Assertions.assertEquals(dog.getBirthDate(), retrievedDog.getBirthDate());
        Assertions.assertEquals(dog.getId(), retrievedDog.getId());

        //Testing remove
        DogHouse.remove(dog);
        retrievedDog = DogHouse.getDogById(1);
        Assertions.assertNull(retrievedDog);

        //Testing remove by id
        DogHouse.add(dog);
        DogHouse.remove(1);
        retrievedDog = DogHouse.getDogById(1);
        Assertions.assertNull(retrievedDog);

        //Testing getDogById
        DogHouse.add(dog);
        retrievedDog = DogHouse.getDogById(1);
        Assertions.assertEquals(dog.getName(), retrievedDog.getName());
        Assertions.assertEquals(dog.getBirthDate(), retrievedDog.getBirthDate());
        Assertions.assertEquals(dog.getId(), retrievedDog.getId());
        DogHouse.remove(1);

        //Testing getNumberOfDogs
        Dog dog1 = new Dog(name, date, 1);
        Dog dog2 = new Dog(name, date, 2);
        Dog dog3 = new Dog(name, date, 3);
        DogHouse.add(dog1);
        DogHouse.add(dog2);
        DogHouse.add(dog3);
        int amountOfCats = DogHouse.getNumberOfDogs();
        Assertions.assertEquals(3, amountOfCats);
    }
}
