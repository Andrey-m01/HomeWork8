package shapes;

public class Rhombus extends Shape{
    private final String name;
    public Rhombus() {
        this.name = "Rhombus";
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
