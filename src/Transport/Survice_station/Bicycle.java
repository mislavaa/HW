package Transport.Survice_station;

public final class Bicycle extends WheeledTransport {
    private String type;


    public Bicycle(int wheelCount, int maxSpeed, String type) {
        super(wheelCount, maxSpeed);
        this.type = type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    protected void service() {
        System.out.print("Обслужено навесное оборудование велосипеда типа " + "'" + type + "'. ");
        super.service();
    }

    @Override
    public String toString() {
        return "Велосипед - " + "'" + type + "', " + super.toString();
    }

}
