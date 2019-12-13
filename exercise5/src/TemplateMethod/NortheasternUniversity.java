package TemplateMethod;

// Inherit the template abstract class and implement two abstract methods.
public class NortheasternUniversity extends TemplateMethod {
    void navigationStart(){
        System.out.println("Destination of navigation is Northeastern University.");
    }

    void drive(){
        System.out.println("Drive on I-680.");
        System.out.println("Drive on US-101.");
    }
}
