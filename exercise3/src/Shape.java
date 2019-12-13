import java.io.Serializable;

// Add implementation of Serializable to baseclass.
public abstract class Shape implements Serializable {
    // Make variable name public in order to be accessed.
    public String name;

    public Shape(String name){
        this.name = name;
    }

    // Every shape can print its name instanced manually.
    public void printName(){
        System.out.println("Shape name is " + name);
    }

    // Declare calculateArea and calculatePerimeter methods as abstract. Implement them in subclass.
    abstract void calculateArea();
    abstract void calculatePerimeter();
}
