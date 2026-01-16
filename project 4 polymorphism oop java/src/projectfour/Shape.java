package projectfour;

public abstract class Shape {
    public abstract double area();
    public abstract void draw();

    @Override
    public String toString() {
        return getClass().getSimpleName() + " area=" + area();
    }
}
