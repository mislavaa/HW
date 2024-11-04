package OOP1.Object;

public final class Dog extends Animal implements Pet {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void play() {
        System.out.println("Собака " + name + " играет");
    }

    @Override
    public void beFriendly() {
        System.out.println("Собака " + name + " дружелюбная");
    }

    @Override
    public void makeSound() {
        System.out.println("Собака " + name + " издаёт звук 'гав-гав'");
    }

    @Override
    public void move() {
        System.out.println("Собака " + name + " ходит");
    }

    @Override
    public void eat() {
        System.out.println("Собака " + name + " ест кость");
    }
}
