package shapes;

public class Triangle extends Shape {
    private String name;
    public Triangle() {
        this.name= "Triangle";
    }

    @Override
    public String toString() {
        return "Shape name is " + this.name;
    }
}