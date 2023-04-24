package org.example;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;

public class mapPet {


    static Animal mapPett(Pet pet) {
        Animal animal = new Animal();
        try {
            Field nameField = pet.getClass().getDeclaredField("name");
            nameField.setAccessible(true);
            animal.title = (String) nameField.get(pet);


            Field statusField = pet.getClass().getDeclaredField("status");
            statusField.setAccessible(true);
            Status status = (Status) statusField.get(pet);
            animal.isAvailable = status == Status.AVAILABLE;
            animal.isSold = status == Status.SOLD;

            Field photosListField = pet.getClass().getDeclaredField("photosList");
            photosListField.setAccessible(true);
            List<Photo> photosList = (List<Photo>) photosListField.get(pet);
            animal.photosMap = new HashMap<>();
            for (Photo photo : photosList) {
                animal.photosMap.put(photo.getName(), photo.getURL());
            }
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return animal;
    }
}
