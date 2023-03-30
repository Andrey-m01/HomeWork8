package shapes;

public class Quad extends Shape{
    private String name;
    public Quad() {
        this.name= "Quad";
    }

    @Override
    public String toString() {
        return "Shape name is " + this.name;
    }
}
