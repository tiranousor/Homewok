package org.example;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class mapPet {


    static Animal mapPett(Pet pet) throws NoSuchFieldException, IllegalAccessException {
        Animal animal = new Animal();
        try {
            Class<?> classs = pet.getClass();

            Field statusField = classs.getDeclaredField("name");
            statusField.setAccessible(true);

            Field fieldStatus = classs.getDeclaredField("status");
            fieldStatus.setAccessible(true);

            Field photosListField = classs.getDeclaredField("photosList");
            photosListField.setAccessible(true);

            String name = (String) statusField.get(pet);
            Status status = (Status) fieldStatus.get(pet);

            Field fieldTitle =  animal.getClass().getDeclaredField("title");
            Field fieldIsAvailable =  animal.getClass().getDeclaredField("isAvailable");
            Field fieldIsSold =  animal.getClass().getDeclaredField("isSold");
            Field fieldPhotosMap =  animal.getClass().getDeclaredField("photosMap");

            fieldTitle.setAccessible(true);
            fieldIsAvailable.setAccessible(true);
            fieldIsSold.setAccessible(true);
            fieldPhotosMap.setAccessible(true);

            fieldTitle.set( animal, name);
            fieldIsAvailable.setBoolean( animal, status == Status.AVAILABLE);
            fieldIsSold.setBoolean( animal, status == Status.SOLD);

            List<Photo> photosList = (List<Photo>) photosListField.get(pet);
            Map<String, String> photosMap = new HashMap<>();
            for (Photo photo : photosList) {
                photosMap.put(photo.getName(), photo.getURL());
            }
            fieldPhotosMap.set( animal, photosMap);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return  animal;
    }
}
