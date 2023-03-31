package shapes;

public class Quad extends Shape{
    private final String name;
    public Quad() {
        this.name= "Quad";
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
