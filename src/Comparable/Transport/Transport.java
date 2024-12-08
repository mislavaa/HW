package Comparable.Transport;

import java.util.Objects;

public abstract class Transport implements Comparable<Transport> {
    private Integer maxSpeed;

    public Transport(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "maxSpeed = " + maxSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Objects.equals(maxSpeed, transport.maxSpeed);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(maxSpeed);
    }

    public int compareTo(Transport o) {
        return Integer.compare(maxSpeed, o.maxSpeed);
    }
}
