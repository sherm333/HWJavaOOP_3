package factory;

import animals.Wolf;

import java.util.ArrayList;
import java.util.Random;

public class WolfFactory {
    private int wolfCount;

    public static ArrayList<Wolf> createWolfs(int wolfCount){
        Random rnd = new Random();
        ArrayList<Wolf> createWolfs = new ArrayList<>();

        for (int i = 0; i < wolfCount; i++) {
            int firstRandom = rnd.nextInt(1,15); // age
            int secondRandom = rnd.nextInt(3, 70); // weight
            int fourthRandom = rnd.nextInt(10); // maneVolume

            createWolfs.add(new Wolf(firstRandom, secondRandom, 4, fourthRandom));
        }
        return createWolfs;
    }
}
