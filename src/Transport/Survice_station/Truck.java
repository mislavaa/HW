package Transport.Survice_station;

public final class Truck extends MotorTransport {
    private int loadCapacity;

    public Truck(int wheelCount, int maxSpeed, String engineType, int loadCapacity) {
        super(wheelCount, maxSpeed, engineType);
        setLoadCapacity(loadCapacity);
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        if (loadCapacity < 0) {
            this.loadCapacity = 0;
            System.out.println("Неверное значение для грузоподъёмности - " + loadCapacity);
        } else {
            this.loadCapacity = loadCapacity;
        }
    }

    @Override
    protected void service() {
        System.out.print("Обслужен грузовик грузоподъёмностью - " + loadCapacity + ". ");
        super.service();
    }

    @Override
    public String toString() {
        return "Грузовик - грузоподъёмность = " + loadCapacity + ", " + super.toString();
    }
}
