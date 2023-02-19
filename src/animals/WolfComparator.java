package animals;

import java.util.Comparator;

public class WolfComparator implements Comparator<Wolf> {
    @Override
    public int compare(Wolf firstWolf, Wolf secondWolf) {
        return Integer.compare(firstWolf.weight, secondWolf.weight);
    }
}
