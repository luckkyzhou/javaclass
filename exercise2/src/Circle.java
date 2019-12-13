public class Circle extends Shape {
    private int radius;
    // Use static field to represent the color.
    private static String color = "blue";

    public Circle(String name, int radius) {
        super(name);
        this.radius = radius;
    }

    public void showColor(){
        System.out.println("Circle is " + color);
    }

    // Override and implement calculateArea and calculatePerimeter methods in specific subclass.
    @Override
    void calculateArea() {
        float area = (float) (3.14 * radius * radius);
        System.out.println("Area is " + area);
    }

    @Override
    void calculatePerimeter() {
        float perimeter = (float) (2 * 3.14 * radius);
        System.out.println("Perimeter is " + perimeter);
    }
}
