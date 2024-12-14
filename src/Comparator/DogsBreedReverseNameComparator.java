package Comparator;

import java.util.Comparator;

public class DogsBreedReverseNameComparator implements Comparator<Dogs> {

    @Override
    public int compare(Dogs o1, Dogs o2) {
        if (o2.getBreed().compareTo(o1.getBreed()) == 0) {
            return o1.getName().compareTo(o2.getName());
        }
        return o2.getBreed().compareTo(o1.getBreed());
    }
}
