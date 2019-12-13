public class Laptop {
    private String brand;
    private String name;
    private String color;
    private int purchaseYear;
    private int appsNumbers;
    private boolean camera;
    private boolean touch;
    private boolean mouse;

    public void isTouch(){
        if (touch){
            System.out.println(name + "can be controlled by touch.");
        } else {
            System.out.println(name + "doesn't have touch control.");
        }
    }

    public void hasCamera(){
        if (camera){
            System.out.println(name + "has camera.");
        } else {
            System.out.println(name + "doesn't have camera.");
        }
    }

    public void nameAndBrand(){
        System.out.println(name + "is from" + brand + ".");
    }

    public Laptop(String name, String color, String brand, int purchaseYear, int appsNumbers, boolean touch, boolean camera, boolean mouse){
        this.name = name;
        this.brand = brand;
        this.color = color;
        this.purchaseYear = purchaseYear;
        this.appsNumbers = appsNumbers;
        this.touch = touch;
        this.camera = camera;
        this.mouse = mouse;
    }
}
