package OOP1.Object;

public class Bird extends Animal {
    private boolean canFly;

    public Bird(String name, boolean canFly) {
        super(name);
        this.canFly = canFly;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    @Override
    public void makeSound() {
        System.out.println("Птица " + name + " издаёт звук 'чирик-чирик'");
    }

    @Override
    public void eat() {
        System.out.println("Птица " + name + " ест семена");
    }

    @Override
    public void move() {
        if (canFly) {
            System.out.println("Птица " + name + " летает");
        } else {
            System.out.println("Птица " + name + " не умеет летать");
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", can fly = " + canFly;
    }
}
