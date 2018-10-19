package com.gardener.plant;

import com.gardener.Nutrient;

public class Flower extends Plant {

    public Flower(String id, int size) {
        super(id, size);
        setSizeLimit(6);
    }

    @Override
    public void setSizeLimit(int sizeLimit) {
        this.sizeLimit = sizeLimit;
    }

    @Override
    void eat(Nutrient nutrient){
        System.out.println(writeInformationOut(nutrient));

        if(nutrient == Nutrient.WATER){
            grow(3);
        } else if(nutrient == Nutrient.BROTH){
            atrophy(1);
        } else if(nutrient == Nutrient.ARTIFICIAL){
            atrophy(1);
        } else{
            atrophy(1);
        }

    }

}
