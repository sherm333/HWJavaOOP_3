package cage;

import animals.Animal;
import animals.Wolf;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WolfCage implements AnimalCage{
    private int cleanCage;
    private ArrayList<Wolf> wolfs;

    public WolfCage(ArrayList<Wolf> wolfs) {
        this.wolfs = wolfs;
    }

    @Override
    public String toString() {
        return "WolfCage{" +
                "cleanCage=" + cleanCage +
                ", wolfs=" + wolfs +
                '}';
    }

    @Override
    public void addAnimal(Animal animal) {
        if(animal instanceof Animal)
            wolfs.add((Wolf) animal);
    }

    @Override
    public void setFeed(int foodWeight) {

    }

    @Override
    public int cleanCage() {
        this.cleanCage = 0;
        return cleanCage;
    }

    @Override
    public List getRandomAnimal() {
        List<Wolf> wolfList = new ArrayList<>();
        int length = wolfs.size();
        Random rnd = new Random();
        int random = rnd.nextInt(length);

        for (int i = 0; i < length; i++) {
            if(i==random) wolfList.add(wolfs.get(i));
        }
        return wolfList;
    }
}
