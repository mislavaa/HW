package Builder;

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
    }
}