package OOP1.Object;

public final class Cat extends Animal implements Pet {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void play() {
        System.out.println("Кошка " + name + " играет");
    }

    @Override
    public void beFriendly() {
        System.out.println("Кошка " + name + " дружелюбная");
    }

    @Override
    public void makeSound() {
        System.out.println("Кошка " + name + " издаёт звук 'мяу'");
    }

    @Override
    public void move() {
        System.out.println("Кошка " + name + " ходит");
    }

    @Override
    public void eat() {
        System.out.println("Кошка " + name + " ест рыбу");
    }
}
