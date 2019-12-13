package FactoryMethod;

// Create an abstract factory class and define public interface of a specific factory.
abstract class Factory {
    public abstract Product Manufacture();
}

// Produce product A.
class FactoryA extends Factory {
    @Override
    public Product Manufacture(){
        return new ProductA();
    }
}

// Produce product B.
class FactoryB extends Factory {
    @Override
    public Product Manufacture(){
        return new ProductB();
    }
}
