package com.codedifferently.labs.partB;

import org.junit.jupiter.api.Assertions;
import partB.animals.Animal;
import partB.animals.Dog;
import partB.animals.Mammal;
import partB.food.Food;

import java.util.Date;

public class DogTest {
    public static void main(String[] args) {
        String name = "Default";
        Date date = new Date();
        int ID = 0;
        Dog dog = new Dog(name, date, ID);

        //Testing Dog Name
        dog.setName("Sparky");
        String actualName = dog.getName();
        Assertions.assertEquals("Sparky", actualName);
        System.out.println("Tested .setName() successfully");

        //Testing Dog Date
        dog.setBirthDate(new Date());
        Date actualDate = dog.getBirthDate();
        Assertions.assertEquals(new Date(), actualDate);
        System.out.println("Tested .setBirthDate() successfully");

        //Testing speak
        String spoke = dog.speak();
        Assertions.assertEquals("bark!", spoke);
        System.out.println("Tested .speak() successfully");

        //Testing eat
        Food food = new Food();
        dog.eat(food);
        int mealsEaten = dog.getNumberOfMealsEaten();
        Assertions.assertEquals(1, mealsEaten);
        System.out.println("Tested .eat() successfully");

        //Testing ID
        int actualID = dog.getId();
        Assertions.assertEquals(ID, actualID);
        System.out.println("Tested .getId() successfully");

        //Testing instanceof Animal
        System.out.println("Testing if object dog is instance of Animal: " + (dog instanceof Animal));

        //Testing instanceof Mammal
        System.out.println("Testing if object dog is instance of Mammal: " + (dog instanceof Mammal));
    }
}
