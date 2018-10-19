package com.gardener.plant;

import com.gardener.Nutrient;

public class Bush extends Plant{

    public Bush(String id, int size) {
        super(id, size);
        setSizeLimit(10);
    }

    @Override
    public void setSizeLimit(int sizeLimit) {
        this.sizeLimit = sizeLimit;
    }

    @Override
    void eat(Nutrient nutrient){
        System.out.println(writeInformationOut(nutrient));

        if(nutrient == Nutrient.WATER){
            grow(1);
        }
        else if(nutrient == Nutrient.BROTH){
            atrophy(1);
        } else if(nutrient == Nutrient.ARTIFICIAL){
            grow(1);
        }
        else{
            atrophy(1);
        }
    }

}
