package com.kindergarten.kids;

import com.kindergarten.Activity;

public class Musician extends Kid{

    public Musician(int satifactionLevel) {
        super(satifactionLevel);
    }


    public void reactToActivity(Activity activity){
        if(activity == Activity.DANCING){
            System.out.println(basicInfoToShow(activity));
        }else if(activity == Activity.SINGING){
            setSatifactionLevel(4);
            System.out.println(positiveInfoToShow(activity));
        }else{
            decreaseSatisfaction(1);
            System.out.println(negativeInfoToShow(activity));
        }
    }
}
