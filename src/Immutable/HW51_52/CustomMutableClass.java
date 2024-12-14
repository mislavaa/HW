package Immutable.HW51_52;

import java.util.Objects;

public class CustomMutableClass {
    private int value;

    public CustomMutableClass(int value) {
        this.value = value;
    }

    public CustomMutableClass(CustomMutableClass other) {
        this.value = other.value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomMutableClass that = (CustomMutableClass) o;
        return value == that.value;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }

    @Override
    public String toString() {
        return "'" + value + "'";
    }
}
