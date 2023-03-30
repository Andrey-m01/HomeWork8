package shapes;

public class Circle extends Shape{
    private String name;
    public Circle() {
        this.name= "Circle";
    }

    @Override
    public String toString() {
        return "Shape name is " + this.name;
    }
}
