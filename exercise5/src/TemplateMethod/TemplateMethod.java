package TemplateMethod;

public abstract class TemplateMethod {
    // Declare the driving process as final to prevent changing during the execution of the process.
    // Five steps during driving process.
    final void drivingProcess(){
        this.engineStart();
        this.navigationStart();
        this.shift();
        this.drive();
        this.reachDestination();
    }

    // Same process, implement directly.
    void engineStart(){
        System.out.println("Start the engine.");
    }

    // Declare it as abstract. Implement in subclass.
    abstract void navigationStart();

    // Same process, implement directly.
    void shift(){
        System.out.println("Gear has been changed.");
    }

    // Declare it as abstract. Implement in subclass.
    abstract void drive();

    // Same process, implement directly.
    void reachDestination(){
        System.out.println("Reach the destination!");
    }
}
