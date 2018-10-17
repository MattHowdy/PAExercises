package com.animals;

import com.animals.animal.Animal;


public class Caretaker {

    public void feed(Animal animal){
        Food food = getFood();
        animal.eat(food);
    }


    public Food getFood(){
        int randNum = (int)(Math.random() * 3);
        return Food.values()[randNum];
    }


}
