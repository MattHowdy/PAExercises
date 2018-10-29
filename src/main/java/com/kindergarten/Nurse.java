package com.kindergarten;

import java.util.concurrent.ThreadLocalRandom;


public class Nurse {

    Activity createActivity() {
        int numOfActivity = Activity.values().length;
        int randomActivity = ThreadLocalRandom.current().nextInt(numOfActivity);
        return Activity.values()[randomActivity];
    }
}
