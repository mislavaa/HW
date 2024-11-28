package Builder;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        House house1 = new House.Builder()
                .floorNumber(5)
                .roomNumber(7)
                .hasGarage(true)
                .build();
        System.out.println(house1);

        House house2 = new House.Builder()
                .floorNumber(2)
                .roomNumber(3)
                .hasGarage(false)
                .build();
        System.out.println(house2);

        House house3 = new House.Builder()
                .floorNumber(5)
                .roomNumber(7)
                .hasGarage(true)
                .build();
        System.out.println(house3);

        House house4 = new House.Builder()
                .floorNumber(6)
                .roomNumber(9)
                .hasGarage(true)
                .build();
        System.out.println(house4);

        House house5 = new House.Builder()
                .floorNumber(2)
                .roomNumber(3)
                .hasGarage(true)
                .build();
        System.out.println(house5);

        List<House> houses = new ArrayList<>();
        houses.add(house1);
        houses.add(house2);
        houses.add(house3);
        houses.add(house4);

        System.out.println("Есть ли house 3 - " + houses.contains(house3));
        System.out.println("Есть ли house 4 - " + houses.contains(house4));

        System.out.println("Есть ли house 5 - " + houses.contains(house5));

        System.out.println("Индекс house 1 - " + houses.indexOf(house1));
        System.out.println("Индекс house 2 - " + houses.indexOf(house2));
        System.out.println("Индекс house 5 - " + houses.indexOf(house5));
    }

}