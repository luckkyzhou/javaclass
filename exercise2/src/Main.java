public class Main {
    public static void main(String[] args){
        // Instance a triangle, print its name, calculate its area and perimeter.
        Triangle triangle = new Triangle("Triangle1",3,4,4,5);
        triangle.printName();
        triangle.calculateArea();
        triangle.calculatePerimeter();

        //Achieve polymorphism.
        show(new Circle("Circle1",3));
        show(new Rectangle("Rectangle12", 13,12));

        Shape a = new Square("Square2",6);
        a.calculateArea();
        Square c = (Square) a;
        c.showColor();
    }

    // Define show function to achieve polymorphism.
    public static void show(Shape a){
        if (a instanceof Triangle){
            Triangle b = (Triangle)a;
            b.showColor();
        } else if (a instanceof Square){
            Square b = (Square)a;
            b.showColor();
        } else if (a instanceof Circle){
            Circle b = (Circle)a;
            b.showColor();
        } else if (a instanceof Rectangle){
            Rectangle b = (Rectangle)a;
            b.showColor();
        }
    }
}
