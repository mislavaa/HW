package Comparable.Transport;

import java.time.LocalDate;
import java.util.Objects;

public class Car extends Transport {
    private String model;
    private Integer year;
    private String color;

    public Car(String model, int year, String color, int maxSpeed) {
        super(maxSpeed);
        this.model = model;
        setYear(year);
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 0 || year > LocalDate.now().getYear()) {
            this.year = null;
            System.out.println("Year out of range - " + year);
        } else {
            this.year = year;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int compareTo(Transport o) {
        Car car = (Car) o;
        if (this.model.compareTo(car.model) == 0) {
            if ((int) this.year == car.year) {
                if (this.color.compareTo(car.color) == 0) {
                    return super.compareTo(o);
                } else {
                    return this.color.compareTo(car.color);
                }
            } else {
                return Integer.compare(this.year, car.year);
            }
        } else {
            return this.model.compareTo(car.model);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return Objects.equals(model, car.model) && Objects.equals(year, car.year) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), model, year, color);
    }

    @Override
    public String toString() {
        return "\nmodel = '" + model + ", year = " + year + ", color = " + color + ", " + super.toString();
    }
}
