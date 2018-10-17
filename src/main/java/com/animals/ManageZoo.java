package com.animals;

public class ManageZoo {

    public static void main(String[] args) {

        Zoo zoo = new Zoo();
        zoo.hireCaretaker(new Caretaker());
        zoo.buyAnimals();
        zoo.feedAnimals(20);
    }
}
