package com.kindergarten.kids;

import com.kindergarten.Activity;

public class Vivid extends Kid{

    public Vivid(int satifactionLevel) {
        super(satifactionLevel);
    }


    public void reactToActivity(Activity activity){
        if(activity == Activity.DANCING){
            System.out.println(basicInfoToShow(activity));
        }else if(activity == Activity.PLAYINGBALLGAME){
            setSatifactionLevel(3);
            System.out.println(positiveInfoToShow(activity));
        }else{
            decreaseSatisfaction(1);
            System.out.println(negativeInfoToShow(activity));
        }
    }
}
