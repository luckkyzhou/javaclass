public class Room {
    public class ElectronicDevice{
        int number;
        String name;
        int timeUsed;
        String color;
        String broken;
        int productionTime;
        String brand;
        double price;

        public ElectronicDevice(String name, int number, int timeUsed, String color, String broken, int productionTime, String brand, double price) {
            this.name = name;
            this.number = number;
            this.timeUsed = timeUsed;
            this.color = color;
            this.broken = broken;
            this.productionTime = productionTime;
            this.brand = brand;
            this.price = price;
        }

        public void printNumber() {
            System.out.println("Number:" + number );
        }

        public void printName() {
            System.out.println("Name:"+ name );
        }

        public void printColor() {
            System.out.println("Color:" + color );
        }
    }

    public class Furniture{
        int number;
        String name;
        int timeUsed;
        String color;
        int productionTime;
        double price;
        String brand;
        boolean broken;


        public Furniture(String name, int number, int timeUsed, String color, boolean broken, int productionTime, String brand, double price) {
            this.name = name;
            this.number = number;
            this.timeUsed = timeUsed;
            this.color = color;
            this.broken = broken;
            this.productionTime = productionTime;
            this.brand = brand;
            this.price = price;
        }

        public void printNumber() {
            System.out.println("Number:" + number );
        }

        public void printName() {
            System.out.println("Name:"+ name );
        }

        public void printColor() {
            System.out.println("Color:" + color );
        }
    }

}
