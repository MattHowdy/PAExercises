package com.kindergarten.kids;

import com.kindergarten.Activity;

public class Comfortable extends Kid{

    public Comfortable(int satifactionLevel) {
        super(satifactionLevel);
    }


    public void reactToActivity(Activity activity){
        if(activity == Activity.SINGING){
            System.out.println(basicInfoToShow(activity));
        }else if(activity == Activity.DRAWING){
            setSatifactionLevel(4);
            System.out.println(basicInfoToShow(activity));
        }else if (activity ==Activity.DANCING){
            decreaseSatisfaction(1);
            System.out.println(negativeInfoToShow(activity));
        }else {
            decreaseSatisfaction(2);
            System.out.println(negativeInfoToShow(activity));
        }
    }


}
