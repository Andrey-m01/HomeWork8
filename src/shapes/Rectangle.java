package shapes;

public class Rectangle extends Shape{
    private final String name;

    @Override
    public String getName() {
        return name;
    }

    public Rectangle() {
        this.name= "Rectangle";
    }

    @Override
    public String toString() {
        return "Shape name is " + this.name;
    }
}
