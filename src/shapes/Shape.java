package shapes;

public class Shape {
    private String name;
    public Shape() {
        this.name = "Shape";
    }

    @Override
    public String toString() {
        return "Shape name is " + this.name;
    }
}
