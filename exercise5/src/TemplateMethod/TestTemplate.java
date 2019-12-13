package TemplateMethod;

public class TestTemplate {
    public static void main(String[] args){
        NortheasternUniversity neu = new NortheasternUniversity();
        McDonalds mc = new McDonalds();
        neu.drivingProcess();
        System.out.println("\n");
        mc.drivingProcess();
    }
}
