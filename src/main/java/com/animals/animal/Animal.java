package com.animals.animal;

import com.animals.Food;

public abstract class Animal {
    private int weight = 0;
    private int weightLimit;

    String name = getClass().getSimpleName();

    public void setWeightLimit(int weightLimit) {
        this.weightLimit = weightLimit;
    }

    public int getWeightLimit() {
        return weightLimit;
    }

    public int checkWeight(){
        return weight;
    }

    public Boolean isAlive(){
        return checkWeight() < getWeightLimit();
    }

    public void increaseWeight(int amount){
        weight += amount;
    }

    public void decreaseWeight(int amount){
        weight = Math.max(0, weight -amount);
    }

    abstract void ingest(Food food);

    public final void eat(Food food){
//        if(!isAlive()) {
//            die();}

        ingest(food);
    }




    private void die() throws  AnimalDied{
        throw new AnimalDied();
    }



    public String currentInfo(Food food) {
        return name + " was given " + food + " and now its weight " + checkWeight();
    }
}
