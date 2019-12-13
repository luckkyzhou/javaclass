public class Stationery {
    private String function;
    private String shape;
    private String size;
    private String name;
    private boolean broken;
    private String color;
    private String storagePlace;
    private int productionYear;

    public void isPen(){
        if (name == "pen"){
            System.out.println("This is a pen.");
        } else {
            System.out.println("This is not a pen.");
        }
    }

    public void isBroken(){
        if (broken){
            System.out.println("This is broken.");
        } else {
            System.out.println("This is unbroken.");
        }
    }

    public void nameAndFunction(){
        System.out.println(name + "is for" + function + ".");
    }

    public Stationery(String name, String size, String shape, String color, String storagePlace, String function, int productionYear, boolean broken){
        this.name = name;
        this.size = size;
        this.shape = shape;
        this.color = color;
        this.storagePlace = storagePlace;
        this.function = function;
        this.productionYear = productionYear;
        this.broken = broken;
    }
}
