import animals.Wolf;
import cage.WolfCage;
import factory.WolfFactory;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Wolf> wolfs = WolfFactory.createWolfs(10);
        WolfCage wolfsInCage = new WolfCage(wolfs);

        List<Wolf> RandomWolf = new ArrayList<>();
        RandomWolf = wolfsInCage.getRandomAnimal();
        System.out.println(RandomWolf);

        Wolf firstWolf = new Wolf(8, 30, 4, 10);
        wolfsInCage.addAnimal(firstWolf);
        System.out.println(wolfsInCage);

        wolfsInCage.sortWeight();
        System.out.println("Sorted by weight:" + wolfsInCage);

        wolfsInCage.sortAge();
        System.out.println("Sorted by age:" + wolfsInCage);



    }
}