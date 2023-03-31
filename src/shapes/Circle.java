package shapes;

public class Circle extends Shape{
    private final String name;
    public Circle() {
        this.name= "Circle";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Shape name is " + this.name;
    }
}
