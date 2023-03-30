import shapes.*;

public class Test {

    public static void main(String[] args) {

        Shape sh = new Triangle();
        Shape sh1 = new Circle();
        Shape sh2 = new Quad();
        Shape sh3 = new Rectangle();
        Shape sh4 = new Rhombus();


        System.out.println(sh.toString());
        System.out.println(sh1.toString());
        System.out.println(sh2.toString());
        System.out.println(sh3.toString());
        System.out.println(sh4.toString());

        System.out.println();

        Shape[] shapes = new Shape[5];
        shapes[0]=new Circle();
        shapes[1]=new Quad();
        shapes[2]=new Rhombus();
        shapes[3]=new Rectangle();
        shapes[4]=new Triangle();

        for (Shape s : shapes){
            System.out.println(s.toString());
        }

    }
}
