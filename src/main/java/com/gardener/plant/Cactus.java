package com.gardener.plant;

import com.gardener.Nutrient;

public class Cactus extends Plant{

    public Cactus(String id, int size) {
        super(id, size);
        setSizeLimit(4);
    }

    @Override
    public void setSizeLimit(int sizeLimit) {
        this.sizeLimit = sizeLimit;
    }

    @Override
    void eat(Nutrient nutrient){
        System.out.println(writeInformationOut(nutrient));

        if(nutrient == Nutrient.WATER){
            atrophy(1);
        } else if(nutrient == Nutrient.BROTH){
            grow(1);
        } else if(nutrient == Nutrient.ARTIFICIAL){
            grow(1);
        } else{
            atrophy(1);
        }
    }

}
