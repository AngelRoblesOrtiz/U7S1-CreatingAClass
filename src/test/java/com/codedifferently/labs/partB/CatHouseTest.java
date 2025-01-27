package com.codedifferently.labs.partB;

import org.junit.jupiter.api.Assertions;
import partB.storage.CatHouse;
import partB.animals.Cat;
import java.util.Date;

public class CatHouseTest {
    public static void main(String[] args) {
        //Testing add
        String name = "Jupiter";
        Date date = new Date();
        Cat cat = new Cat(name, date, 1);
        CatHouse.add(cat);
        Cat retrievedCat = CatHouse.getCatById(1);
        Assertions.assertEquals(cat.getName(), retrievedCat.getName());
        Assertions.assertEquals(cat.getBirthDate(), retrievedCat.getBirthDate());
        Assertions.assertEquals(cat.getId(), retrievedCat.getId());

        //Testing remove
        CatHouse.remove(cat);
        retrievedCat = CatHouse.getCatById(1);
        Assertions.assertNull(retrievedCat);

        //Testing remove by id
        CatHouse.add(cat);
        CatHouse.remove(1);
        retrievedCat = CatHouse.getCatById(1);
        Assertions.assertNull(retrievedCat);

        //Testing getCatById
        CatHouse.add(cat);
        retrievedCat = CatHouse.getCatById(1);
        Assertions.assertEquals(cat.getName(), retrievedCat.getName());
        Assertions.assertEquals(cat.getBirthDate(), retrievedCat.getBirthDate());
        Assertions.assertEquals(cat.getId(), retrievedCat.getId());
        CatHouse.remove(1);

        //Testing getNumberOfCats
        Cat cat1 = new Cat(name, date, 1);
        Cat cat2 = new Cat(name, date, 2);
        Cat cat3 = new Cat(name, date, 3);
        CatHouse.add(cat1);
        CatHouse.add(cat2);
        CatHouse.add(cat3);
        int amountOfCats = CatHouse.getNumberOfCats();
        Assertions.assertEquals(3, amountOfCats);
    }
}
