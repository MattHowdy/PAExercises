package com.gardener.plant;

import com.gardener.Nutrient;

public abstract class Plant {
    int size;
    String id;
    int sizeLimit;

    public final void process(Nutrient nutrient){
        eat(nutrient);
    }

    abstract void eat(Nutrient nutrient);

    public Plant(String id,int size) {
        setId(id);
        setActulSize(size);
    }

    String name = getClass().getSimpleName();

    public abstract void setSizeLimit(int sizeLimit);

    public int getSizeLimit() {
        return sizeLimit;
    }


    void grow(int amount){
        size += amount;
    }

    void atrophy(int amount){
        size = Math.max(0, size-amount);
    }

    public void setActulSize(int size) {
        this.size = size;
    }

    public int getActualSize() {
        return size;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public boolean isAlive(){
        return getSizeLimit() > getActualSize();
    }

    public String writeInformationOut(Nutrient nutrient){
        return getName() + " " + getId() +
                " was given " + nutrient +
                ", now its size " + getActualSize();
    }

    protected String getId(){
        return id;
    };
}
