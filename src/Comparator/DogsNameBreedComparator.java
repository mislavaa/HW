package Comparator;

import java.util.Comparator;

public class DogsNameBreedComparator implements Comparator<Dogs> {

    @Override
    public int compare(Dogs o1, Dogs o2) {
        if (o1.getName().compareTo(o2.getName()) == 0) {
            return o1.getBreed().compareTo(o2.getBreed());
        }
        return o1.getName().compareTo(o2.getName());
    }
}
