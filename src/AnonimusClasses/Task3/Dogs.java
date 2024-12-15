package AnonimusClasses.Task3;

import java.util.Comparator;

public class Dogs implements Comparable<Dogs> {
    private String name;
    private int age;

    public Dogs(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name + ": возраст " + age;
    }

    @Override
    public int compareTo(Dogs o) {
        return Comparator.comparing(Dogs::getName)
                .thenComparing(Dogs::getAge)
                .compare(this, o);
    }
}
