package shapes;

public class Rectangle extends Shape{
    private String name;
    public Rectangle() {
        this.name= "Rectangle";
    }

    @Override
    public String toString() {
        return "Shape name is " + this.name;
    }
}
