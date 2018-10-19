package com.gardener;
import com.gardener.plant.Plant;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.*;


public class Garden {
    private Gardener gardener;
    List<Plant> plants = new LinkedList<>();

    public void hireGardener(Gardener gardener) {
        this.gardener = gardener;
    }


    public void buyPlants(List<List<String>> plantDetails) {
        int len = plantDetails.size();
        String planType;
        String id;
        int size;

        String path = "com.gardener.plant.";

        try {
            for (int i = 0; i < len ; i++) {
                List tempList = plantDetails.get(i);

                planType = (String)tempList.get(0);
                id = (String)tempList.get(1);
                size = Integer.parseInt((String)tempList.get(2));

                Class clazz = Class.forName(path+planType);
                Constructor constructor = clazz.getConstructor(String.class, int.class);
                plants.add((Plant)constructor.newInstance(id,size));
            }
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }


    void stubSprinkledPlants(List<Plant> sprinkledPlants){
        plants.removeAll(sprinkledPlants);
    }



    public void nutratePlants(List<Integer> typesOfNutrient, int workingDays) {
        List<Plant> sprinkeldPlants = new LinkedList<>();

        for (int i = 1; i <= workingDays; i++) {
            System.out.println("Day #" + i);
            Iterator<Plant> itr = plants.iterator();
            int typeOfNutr = typesOfNutrient.get(i-1);

            while(itr.hasNext()){

                Plant plant = itr.next();
                if (plant.isAlive()){
                    gardener.nutrate(plant, typeOfNutr);
                } else{
                    System.out.println(plant.getName() + " has died.:(");
                    sprinkeldPlants.add(plant);
                   }
                }
                stubSprinkledPlants(sprinkeldPlants);
                }
     }
}
