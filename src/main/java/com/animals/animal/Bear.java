package com.animals.animal;

import com.animals.Food;

public class Bear extends Animal{

    public Bear() {
        setWeightLimit(10);
    }

    @Override
    void ingest(Food food) {
        System.out.println( currentInfo(food));
        if(isAlive()){
            if(food == Food.MEAT){
                increaseWeight(1);
            }
            else if( food == Food.FRUIT){
                increaseWeight(1);
            } else{
                System.out.println(name + " was given " + food);
            }
        }
        else {
            System.out.println(name + " is died");
        }
    }

}
