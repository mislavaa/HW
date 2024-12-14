package Immutable.HW51_52;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public final class ImmutableClass {
    private final String name;
    private final List<Integer> numbers;
    private final CustomMutableClass value;

    public ImmutableClass(String name, List<Integer> numbers, CustomMutableClass value) {
        this.name = name;
        this.numbers = new ArrayList<>();
        this.numbers.addAll(numbers);
        this.value = new CustomMutableClass(value);
    }

    public String getName() {
        return name;
    }

    public List<Integer> getNumbers() {
        return Collections.unmodifiableList(numbers);
    }

    public CustomMutableClass getValue() {
        return new CustomMutableClass(value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ImmutableClass that = (ImmutableClass) o;
        return Objects.equals(name, that.name) && Objects.equals(numbers, that.numbers) && Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, numbers, value);
    }

    @Override
    public String toString() {
        return "ImmutableClass{" +
                "name = '" + name + '\'' +
                ", numbers = " + numbers +
                ", value = " + value +
                '}';
    }
}
