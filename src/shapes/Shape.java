package shapes;

public class Shape {
    private final String name;
    public Shape() {
        this.name = "Shape";
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Shape name is " + this.name;
    }
}
