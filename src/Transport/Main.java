package Transport;


import Transport.Survice_station.Bicycle;
import Transport.Survice_station.Car;
import Transport.Survice_station.ServiceStation;
import Transport.Survice_station.Truck;

public class Main {
    public static void main(String[] args) {
        Bicycle bike = new Bicycle(2, 12, "горный");
        Car car = new Car(4, 185, "бензиновый", "TOYOTA", "Verso");
        Truck truck = new Truck(4, 140, "дизельный", 250);

        System.out.println(car);
        System.out.println(bike);
        System.out.println(truck);

        ServiceStation station1 = new ServiceStation("Станция 1");

        System.out.println();

        station1.service(bike);
        station1.service(car);
        station1.service(truck);


    }
}
