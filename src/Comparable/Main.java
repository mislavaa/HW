package Comparable;

import Comparable.Transport.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Lada", 2024, "Black", 185);
        Car car2 = new Car("Lada", 2024, "White", 180);
        Car car3 = new Car("Lada", 2024, "Red", 140);
        Car car4 = new Car("Lada", 2023, "Gray", 180);
        Car car5 = new Car("Volga", 2024, "Black", 130);
        Car car6 = new Car("Volga", 2023, "White", 130);
        Car car7 = new Car("Volga", 2022, "Red", 150);
        Car car8 = new Car("Audi", 2020, "Red", 250);

        List<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);
        cars.add(car7);
        cars.add(car8);

        Collections.sort(cars);
        System.out.println(cars);

        Car car9 = new Car("Audi", 2020, "Red", 250);
        System.out.println("\nIs there Audi - " + cars.contains(car9));

        Car car10 = new Car("Volga", 2022, "Red", 130);
        Car car11 = new Car("Audi", 2020, "Red", 230);
        cars.add(car10);
        cars.add(car11);

        Collections.sort(cars);
        System.out.println(cars);
    }
}
