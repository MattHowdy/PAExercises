package com.kindergarten.kids;


import com.kindergarten.Activity;

public abstract class Kid {
    private int satifactionLevel;
    private String name = getClass().getSimpleName();


    Kid(int satifactionLevel){
        this.satifactionLevel = satifactionLevel;
    }


    private int getSatifactionLevel() {
        return satifactionLevel;
    }

    void setSatifactionLevel(int satifactionLevel) {
        this.satifactionLevel = satifactionLevel;
    }

    public boolean isWhining(){
        return getSatifactionLevel() < 1;
    }

    public void reactToActivity(Activity activity){};

    void decreaseSatisfaction(int amount){
        satifactionLevel -= amount;
    }


    String basicInfoToShow(Activity activity){
        return name + "is doing "  + activity + " her satfisfaction is: " + getSatifactionLevel() + ".";
    }

    String negativeInfoToShow(Activity activity){
        return name + "is doing "  + activity + " her satfisfaction is: " + getSatifactionLevel() + " and she is getting unsatisfied.";
    }

    String positiveInfoToShow(Activity activity){
        return name + "is doing her favority activity: "  + activity + " so she is satfisfied very much " + getSatifactionLevel();
    }
}
