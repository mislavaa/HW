package Transport.Survice_station;

public abstract class WheeledTransport {
    private int wheelCount;
    private int maxSpeed;

    public WheeledTransport(int wheelCount, int maxSpeed) {
        setWheelCount(wheelCount);
        setMaxSpeed(maxSpeed);
    }

    public int getWheelCount() {
        return wheelCount;
    }

    public void setWheelCount(int wheelCount) {
        if (wheelCount < 0) {
            this.wheelCount = 0;
            System.out.println("Неверное значение для количества колёс - " + wheelCount);
        } else {
            this.wheelCount = wheelCount;
        }
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed < 0) {
            this.maxSpeed = 0;
            System.out.println("Неверное значение для скорости - " + maxSpeed);
        } else {
            this.maxSpeed = maxSpeed;
        }
    }

    protected void service() {
        System.out.println("Обслужено колёс - " + wheelCount + ".");
    }

    @Override
    public String toString() {
        return "количество колёс = " + wheelCount +
                ", максимальная скорость = " + maxSpeed;
    }
}