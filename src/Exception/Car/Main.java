package Exception.Car;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        cars.add(new Car("UAZ", 2010));
        cars.add(new Car("LADA", 2010));
        cars.add(new Car("UAZ", 2011));

        try {
            getCar(cars, "LADA", 2010);
            getCar(cars, "UAZ", 2010);
            getCar(cars, "LADA", 2012);
        } catch (CarNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Находит машину в списке по указанным параметрам
     * @param cars список машин
     * @param model модель
     * @param year год выпуска
     * @throws CarNotFoundException ошибка при отсутствии машины в списке
     */
    public static void getCar(List<Car> cars, String model, int year) throws CarNotFoundException {
        boolean hasCar = false;
        for (Car car : cars) {
            if (car.getModel().equals(model) && car.getYear() == year) {
                System.out.println("Найдена машина - " + car);
                hasCar = true;
                break;
            }
        }
        if (!hasCar) {
            throw new CarNotFoundException("Машина с параметрами - " + model + " " + year + " в списке не найдена");
        }
    }
}
