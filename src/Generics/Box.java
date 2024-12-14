package Generics;

public class Box<T> {
    private T object;

    public Box() {
    }

    public Box(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public T get() {
        return getObject();
    }

    public void set(T object) {
        this.setObject(object);
    }

    public boolean isEmpty() {
        return object == null;
    }

    public void clear() {
        object = null;
    }

    @Override
    public String toString() {
        return "'" + object + "'";
    }
}
