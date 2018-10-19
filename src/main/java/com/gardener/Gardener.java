package com.gardener;

import com.gardener.plant.Plant;



public class Gardener {

    public void nutrate(Plant plant, int typeOfNutr) {
        Nutrient nutrient = getNutrient(typeOfNutr);
        plant.process(nutrient);

    }

    Nutrient getNutrient(int typeOfNutr){
        return Nutrient.values()[typeOfNutr];
    }


}
