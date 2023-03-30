package shapes;

public class Rhombus extends Shape{
    private String name;
    public Rhombus() {
        this.name = "Rhombus";
    }

    @Override
    public String toString() {
        return "Shape name is " + this.name;
    }
}
