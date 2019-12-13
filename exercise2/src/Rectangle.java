public class Rectangle extends Shape {
    private int length;
    private int width;
    // Use static field to represent the color.
    private static String color = "white";

    public Rectangle(String name, int length, int width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    public void showColor(){
        System.out.println("Rectangle is " + color);
    }

    // Override and implement calculateArea and calculatePerimeter methods in specific subclass.
    @Override
    void calculateArea() {
        int area = length * width;
        System.out.println("Area is " + area);
    }

    @Override
    void calculatePerimeter() {
        int perimeter = 2 * (length + width);
        System.out.println("Perimeter is " + perimeter);
    }
}
