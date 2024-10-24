package OOP1;

import OOP1.Object.*;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("cat");
        System.out.println(cat);
        cat.makeSound();

        Bird bird = new Bird("bird", true);
        System.out.println(bird);
        bird.makeSound();

        Dog dog = new Dog("dog");
        System.out.println(dog);
        dog.makeSound();

        Cat cat1 = new Cat("Мурка");
        System.out.println(cat1);
        cat1.eat();

        Bird bird1 = new Bird("Кеша", false);
        System.out.println(bird1);
        bird1.eat();

        Dog dog1 = new Dog("Пушок");
        System.out.println(dog1);
        dog1.eat();

        System.out.println("\nmakeSound(), eat() и move() через массив объектов типа Animal: ");
        Animal[] animals = {cat, dog, bird, dog1, cat1, bird1};
        for (Animal animal : animals) {
            animal.makeSound();
            animal.eat();
            animal.move();
            if (animal instanceof Pet) {
                ((Pet) animal).play();
                ((Pet) animal).beFriendly();
            }
        }
    }
}
