package Transport.Survice_station;

public final class Car extends MotorTransport {
    private String model;
    private String make;

    public Car(int wheelCount, int maxSpeed, String engineType, String make, String model) {
        super(wheelCount, maxSpeed, engineType);
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    protected void service() {
        System.out.print("Обслужена машина марка '" + make + "'" + ", модель '" + model + "'. ");
        super.service();
    }

    @Override
    public String toString() {
        return "Машина - " + "'" + make + " " + model + "', " + super.toString();
    }
}
