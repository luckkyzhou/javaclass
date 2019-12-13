public class Roommate {
    private String name;
    private String sex;
    private String country;
    private String job;
    private int age;
    private int birthYear;
    private int height;
    private boolean single;

    public void isStudent(){
        if (job.equals("student")){
            System.out.println(name + " is a student.");
        } else {
            System.out.println(name + " is not a student.");
        }
    }

    public void isSingle(){
        if (single){
            System.out.println(name + " is single.");
        } else {
            System.out.println(name + " is not single.");
        }

    }

    public void show(){
        System.out.println(name + " is " + height + "cm tall and is " + age + " years old.");
    }

    public Roommate(String name, String sex, String country, String job, int age, int birthYear, int height, boolean single){
        this.name = name;
        this.sex = sex;
        this.country = country;
        this.job = job;
        this.age = age;
        this.birthYear = birthYear;
        this.height = height;
        this.single = single;
    }
}
