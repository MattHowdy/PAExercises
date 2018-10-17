package com.animals;

import com.animals.animal.*;


import java.util.*;

public class Zoo {
    Optional<Caretaker> caretaker = Optional.empty();
    List<Animal> animals = new LinkedList<>();



    public void hireCaretaker(Caretaker caretaker){
        this.caretaker = Optional.of(caretaker);
    }



    public void buyAnimals(){
        int freePlacesInZoo = 20;

        for (int i = freePlacesInZoo; i > 0; i--) {
            animals.add(randomAnimal());
        }
    }



    public void feedAnimals(int days){
        if(!caretaker.isPresent()){
            try {
                throw new MissingCareTaker();
            } catch (MissingCareTaker missingCareTaker) {
                missingCareTaker.printStackTrace();
            }
        }
        List<Animal> diedAnimals = new LinkedList<>();

        for (int i = 1; i <= days; i++) {
            System.out.println("Day #" + i);
            Caretaker caretaker = this.caretaker.get();
            Iterator<Animal> it = animals.iterator();

            while(it.hasNext()){
                Animal animal = it.next();
                if(animal.isAlive()){
                    caretaker.feed(animal);
                } else{
                    diedAnimals.add(animal);
                }
            }
            buryAnimals(diedAnimals);
        }
    }



    private void buryAnimals(List<Animal> animal) {
        animals.removeAll(animal);
    }


    private Animal randomAnimal(){
        List<Animal> animals = new ArrayList<>(Arrays.asList(new Hedgehog(), new Rabbit(), new Wolf(), new Bear()));
        int randNum = (int)(Math.random() * 4);

        return animals.get(randNum);
    }



}
