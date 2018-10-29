package com.kindergarten;

public class Municipality {


    public static void main(String[] args) {
        startDay();
    }


    private static void startDay(){
        KinderGarten kinderGarten = new KinderGarten();
        kinderGarten.hireNurse(new Nurse());
        kinderGarten.kidsToGoToKinderGarten();
        kinderGarten.playingActivities(4);
    }

}
