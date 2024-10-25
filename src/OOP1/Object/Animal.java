package OOP1.Object;

public abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void makeSound();

    public abstract void move();

    public abstract void eat();

    @Override
    public String toString() {
        return "name = '" + name + "'";
    }
}
