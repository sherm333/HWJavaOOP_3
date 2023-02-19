package cage;

import animals.Animal;

import java.util.List;

public interface AnimalCage {
    void addAnimal(Animal animal);

    void setFeed(int foodWeight);

    int cleanCage();

    List getRandomAnimal();
}
