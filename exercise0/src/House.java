public class House {
    private String host;
    private String size;
    private int constructionYear;
    private int numberOfBedrooms;
    private int numberOfRestrooms;
    private int numberOfKitchens;
    private int floors;
    private boolean heating;

    public void hasHeating(){
        if (heating){
            System.out.println("This house has heating.");
        } else {
            System.out.println("This house doesn't have heating.");
        }
    }

    public void showFloors(){
        System.out.println("This house has " + floors + " floors.");
    }

    public void showHost(){
        System.out.println("This house is owned by " + host + ".");
    }

    public House(String host, String size, int constructionYear, int numberOfBedrooms, int numberOfRestrooms, int numberOfKitchens, int floors, boolean heating){
        this.host = host;
        this.size = size;
        this.constructionYear = constructionYear;
        this.numberOfBedrooms = numberOfBedrooms;
        this.numberOfRestrooms = numberOfRestrooms;
        this.numberOfKitchens = numberOfKitchens;
        this.floors = floors;
        this.heating = heating;
    }
}
