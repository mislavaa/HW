package Builder;

import java.util.Objects;

public class House {
    private int floorNumber;
    private int roomNumber;
    private boolean hasGarage;

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setHasGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
    }

    private House(Builder builder) {
        this.floorNumber = builder.floorNumber;
        this.roomNumber = builder.roomNumber;
        this.hasGarage = builder.hasGarage;
    }

    @Override
    public String toString() {
        return "House{" +
                "floorNumber = " + floorNumber +
                ", roomNumber = " + roomNumber +
                ", hasGarage = " + hasGarage +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return floorNumber == house.floorNumber && roomNumber == house.roomNumber;  //&& hasGarage == house.hasGarage; // Проверка без одного поля
    }

    @Override
    public int hashCode() {
        return Objects.hash(floorNumber, roomNumber/*, hasGarage*/);
    }

    public static class Builder {
        private int floorNumber;
        private int roomNumber;
        private boolean hasGarage;

        public Builder() {
        }

        public Builder floorNumber(int floorNumber) {
            this.floorNumber = floorNumber;
            return this;
        }

        public Builder roomNumber(int roomNumber) {
            this.roomNumber = roomNumber;
            return this;
        }

        public Builder hasGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }
}