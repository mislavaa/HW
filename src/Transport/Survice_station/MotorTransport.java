package Transport.Survice_station;

public abstract class MotorTransport extends WheeledTransport {
    private String engineType;

    public MotorTransport(int wheelCount, int maxSpeed, String engineType) {
        super(wheelCount, maxSpeed);
        this.engineType = engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getEngineType() {
        return engineType;
    }

    @Override
    protected void service() {
        System.out.print("Обслужен двигатель типа " + "'" + engineType + "'. ");
        super.service();
    }

    @Override
    public String toString() {
        return super.toString() + ", тип двигателя = '" + engineType + "'";
    }
}
