package FactoryMethod;

// Create an abstract product class and define public interface for specific products.
abstract class Product {
    public abstract void Show();
}

// Specific product A.
class ProductA extends Product {
    @Override
    public void Show(){
        System.out.println("We have made product A.");
    }
}

// Specific product B.
class ProductB extends Product {
    @Override
    public void Show(){
        System.out.println("We have made product B.");
    }
}