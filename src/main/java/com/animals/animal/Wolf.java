package com.animals.animal;

import com.animals.Food;

public class Wolf extends Animal{

    public Wolf() {
        setWeightLimit(6);
    }

    @Override
    void ingest(Food food) {
        System.out.println(currentInfo(food));

        if(isAlive()){
            if(food == Food.MEAT){
                increaseWeight(3);
            }
            else if( food == Food.VEGETABLES){
                decreaseWeight(1);
            }else{
                decreaseWeight(1);
            }
        }
        else {
            System.out.println(name + " is died");
        }
    }

}
