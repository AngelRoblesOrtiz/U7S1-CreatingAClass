package com.codedifferently.labs.partB;
import org.junit.jupiter.api.Assertions;
import partB.animals.Animal;
import partB.animals.Cat;
import partB.animals.Mammal;
import partB.food.Food;

import java.util.Date;

public class CatTest {
    public static void main(String[] args) {
        String name = "Default";
        Date date = new Date();
        int ID = 0;
        Cat cat = new Cat(name, date, ID);

        //Testing Cat Name
        cat.setName("MeowMeow");
        String actualName = cat.getName();
        Assertions.assertEquals("MeowMeow", actualName);
        System.out.println("Tested .setName() successfully");

        //Testing Cat Date
        cat.setBirthDate(new Date());
        Date actualDate = cat.getBirthDate();
        Assertions.assertEquals(new Date(), actualDate);
        System.out.println("Tested .setBirthDate() successfully");

        //Testing Speak
        String spoke = cat.speak();
        Assertions.assertEquals("meow!", spoke);
        System.out.println("Tested .speak() successfully");

        //Testing Eat
        Food food = new Food();
        cat.eat(food);
        int mealsEaten = cat.getNumberOfMealsEaten();
        Assertions.assertEquals(1, mealsEaten);
        System.out.println("Tested .eat() successfully");

        //Testing ID
        int actualID = cat.getId();
        Assertions.assertEquals(ID, actualID);
        System.out.println("Tested .getId() successfully");

        //Testing instanceof Animal
        System.out.println("Testing if object cat is instance of Animal: " + (cat instanceof Animal));

        //Testing instanceof Mammal
        System.out.println("Testing if object cat is instance of Mammal: " + (cat instanceof Mammal));
    }
}
