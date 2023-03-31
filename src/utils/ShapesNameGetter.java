package utils;

import shapes.Shape;

public class ShapesNameGetter {
    public ShapesNameGetter(Shape shape) {
        System.out.println(shape.getName());
    }

    public ShapesNameGetter() {
    }

    public String toString(Shape shape) {
        return "Shape name is: " + shape.getName();
    }

    public String toString(Shape[] shape) {
        StringBuilder tmp = new StringBuilder("Shapes names: ");
        for (Shape s : shape){
            tmp.append("[")
                    .append(s.getName())
                    .append("] ");
        }
        return tmp.toString();
    }
}
