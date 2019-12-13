import java.io.Serializable;

// Add implementation of Serializable to subclass.
public class Triangle extends Shape implements Serializable {
    // Make variables public in order to be accessed.
    public int bottom;
    public int height;
    public int side1;
    public int side2;
    // Use static field to represent the color.
    private static String color = "red";

    public Triangle(String name, int bottom, int height, int side1, int side2) {
        super(name);
        this.bottom = bottom;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
    }

    public void showColor(){
        System.out.println("Triangle is " + color);
    }

    // Override and implement calculateArea and calculatePerimeter methods in specific subclass.
    @Override
    void calculateArea() {
        float area = (float) (0.5 * bottom * height);
        System.out.println("Area is " + area);
    }

    @Override
    void calculatePerimeter() {
        int perimeter = bottom + side1 + side2;
        System.out.println("Perimeter is " + perimeter);
    }
}
