package com.kindergarten;

import com.kindergarten.kids.Comfortable;
import com.kindergarten.kids.Kid;
import com.kindergarten.kids.Musician;
import com.kindergarten.kids.Vivid;

import java.util.ArrayList;
import java.util.List;

public class KinderGarten {
    private List<Kid> kids = new ArrayList<>();
    private Nurse nurse;


    void playingActivities(int days){

        for (int i = 0; i < days; i++) {
            for (Kid kid: kids) {
                Activity activity = nurse.createActivity();
                kid.reactToActivity(activity);
                if(isChaos()){
                    System.out.println("There is "+ checkWhiningKids() +" whining kids so there are chaos in the kindergarten.");
                }
            }
        }
    };

    private boolean isChaos(){
        if(checkWhiningKids() > 3){
            return true;
        };
        return false;
    }

    private int checkWhiningKids(){
        int maxWhiningKid = 0;

        for (Kid kid :kids) {
            if(kid.isWhining()){
                maxWhiningKid ++;
            }
        }
        return maxWhiningKid;
    }


    void hireNurse(Nurse nurse) {
        this.nurse = nurse;
    }

    void kidsToGoToKinderGarten() {
        int numOfKids = 8;

        for (int i = 0; i < numOfKids; i++) {
            kids.add(new Vivid(3));
            kids.add(new Musician(2));
            kids.add(new Comfortable(4));
        }
    }
}
