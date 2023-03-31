package shapes;

public class Triangle extends Shape {
    private final String name;

    @Override
    public String getName() {
        return name;
    }

    public Triangle() {
        this.name= "Triangle";
    }

    @Override
    public String toString() {
        return "Shape name is " + this.name;
    }
}