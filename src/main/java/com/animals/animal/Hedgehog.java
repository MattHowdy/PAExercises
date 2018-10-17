package com.animals.animal;

import com.animals.Food;

public class Hedgehog extends Animal{

    public Hedgehog() {
        setWeightLimit(5);
    }

    @Override
    void ingest(Food food) {
        System.out.println(currentInfo(food));
        if(isAlive()){
            if(food == Food.MEAT){
                decreaseWeight(1);
            }
            else if(food == Food.FRUIT){
                increaseWeight(2);
            } else {
                System.out.println(name + " was given " + food);
            }
        }
        else {
            System.out.println(name + " is died");
        }
    }

}
