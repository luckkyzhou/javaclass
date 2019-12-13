public class Pet {
    private String owner;
    private String name;
    private String breed;
    private String sex;
    private String color;
    private int age;
    private int birthYear;
    private boolean domestic;

    public void isDomestic(){
        if (domestic){
            System.out.println(name + " is a domestic pet.");
        } else {
            System.out.println(name + " is not a domestic pet.");
        }
    }

    public void showOwner(){
        System.out.println(name + "'s owner is " + owner + ".");
    }

    public void showBreed(){
        System.out.println(name + " is a " + breed + ".");
    }

    public Pet(String owner, String name, String breed, String sex, String color, int age, int birthYear, boolean domestic){
        this.owner = owner;
        this.name = name;
        this.breed = breed;
        this.sex = sex;
        this.color = color;
        this.age = age;
        this.birthYear = birthYear;
        this.domestic = domestic;
    }
}
