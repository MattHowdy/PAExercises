package com.animals.animal;

import com.animals.Food;

public class Rabbit extends Animal{

    public Rabbit() {
        setWeightLimit(4);
    }

    @Override
    void ingest(Food food) {
        System.out.println(currentInfo(food));

        if(isAlive()){
            if(food == Food.MEAT){
                decreaseWeight(2);
            }
            else if( food == Food.VEGETABLES){
                increaseWeight(2);
            }else{
                increaseWeight(1);
            }
        }
        else {
            System.out.println(name + " is died");
        }
    }

}
