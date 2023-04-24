package org.example;

import java.util.Arrays;
import java.util.List;

import static org.example.mapPet.mapPett;


public class Main {
    public static void main(String[] args) throws Exception {
        Pet cat = new Pet("Барсик", Status.AVAILABLE,
                List.of(new Photo("рич барсик",
                                "https://ru.pinterest.com/pin/422281209184592/"),
                        new Photo("Барсик устац",
                                "https://ru.pinterest.com/pin/26529085297309957/")
                ));
        Animal animalCat =  mapPett(cat);
        System.out.println(animalCat);
    }

}

