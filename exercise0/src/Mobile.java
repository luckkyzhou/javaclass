public class Mobile {
    private String shape;
    private String brand;
    private String name;
    private String color;
    private int purchaseYear;
    private int appsNumbers;
    private boolean navigation;
    private boolean camera;

    public void hasNavigation(){
        if (navigation){
            System.out.println(name + "has navigation.");
        } else {
            System.out.println(name + "doesn't have navigation.");
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

    public Mobile(String name, String color, String brand, String shape, int purchaseYear, int appsNumbers, boolean navigation, boolean camera){
        this.name = name;
        this.brand = brand;
        this.shape = shape;
        this.color = color;
        this.purchaseYear = purchaseYear;
        this.appsNumbers = appsNumbers;
        this.navigation = navigation;
        this.camera = camera;
    }
}
