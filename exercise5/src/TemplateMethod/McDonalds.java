package TemplateMethod;

// Inherit the template abstract class and implement two abstract methods.
public class McDonalds extends TemplateMethod {
    void navigationStart(){
        System.out.println("Destination of navigation is McDonald's.");
    }

    void drive(){
        System.out.println("Drive on Landess Ave.");
    }
}
