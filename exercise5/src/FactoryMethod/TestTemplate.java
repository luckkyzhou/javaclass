package FactoryMethod;

// Production workflow.
public class TestTemplate {
    public static void main(String[] args){
        // Customer wants product A.
        FactoryA factoryA = new FactoryA();
        factoryA.Manufacture().Show();

        // Customer wants product B.
        FactoryB factoryB = new FactoryB();
        factoryB.Manufacture().Show();
    }
}
