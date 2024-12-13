package Comparator;

import java.util.Comparator;

public class Dogs implements Comparable<Dogs> {
    private String name;
    private String breed;

    public Dogs(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return name + ": " + breed;
    }

    @Override
    public int compareTo(Dogs o) {
        return Comparator.comparing(Dogs::getName)
                .thenComparing(Dogs::getBreed)
                .compare(this, o);
    }
}
