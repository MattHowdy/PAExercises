package com.gardener;


import java.util.ArrayList;
import java.util.List;

public class Company {
    static int workingDays;
    static List<Integer> typeOfNutrient = new ArrayList<>();
    static List planDetails = new ArrayList<>();

    public static void main(String[] args) {
        handleOffice();
        handleGarden();
    }


    static void handleOffice(){
        Office office = new Office();
        office.handleInput();
        workingDays = office.getNumOfDays();
        typeOfNutrient = office.getNutritientType();
        planDetails = office.getDetailedPlanList();

    }


    static void handleGarden(){
        Garden garden = new Garden();
        garden.hireGardener(new Gardener());
        garden.buyPlants(planDetails);
        garden.nutratePlants(typeOfNutrient, workingDays);
    }



}
