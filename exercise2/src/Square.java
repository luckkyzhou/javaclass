public class Square extends Shape {
    private int side;
    // Use static field to represent the color.
    private static String color = "yellow";

    public Square(String name, int side) {
        super(name);
        this.side = side;
    }

    public void showColor(){
        System.out.println("Square is " + color);
    }

    // Override and implement calculateArea and calculatePerimeter methods in specific subclass.
    @Override
    void calculateArea() {
        int area = side * side;
        System.out.println("Area is " + area);
    }

    @Override
    void calculatePerimeter() {
        int perimeter = 4 * side;
        System.out.println("Perimeter is " + perimeter);
    }
}
