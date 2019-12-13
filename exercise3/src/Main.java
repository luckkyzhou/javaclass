import java.io.*;

public class Main {
    public static void main(String[] args){
        // Instantiate a Triangle.
        Triangle triangle = new Triangle("Triangle1",3,4,4,5);

        // Serialize the triangle into file "shape.ser".
        try{
            FileOutputStream fileOut = new FileOutputStream("src/shape.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(triangle);
            out.close();
            fileOut.close();
            System.out.print("Serialized data is saved in src/shape.ser\n");
        }catch(IOException i){
            i.printStackTrace();
        }

        // Deserialize triangle1 from file "shape.ser".
        Triangle triangle1 = null;
        try{
            FileInputStream fileIn = new FileInputStream("src/shape.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            triangle1 = (Triangle) in.readObject();
            in.close();
            fileIn.close();
        }catch(IOException i){
            i.printStackTrace();
            return;
        }catch(ClassNotFoundException c){
            System.out.println("Triangle class not found");
            c.printStackTrace();
            return;
        }
        // Print out the elements of triangle1.
        System.out.println("Deserialized Triangle...");
        System.out.println("Name: " + triangle1.name);
        System.out.println("bottom: " + triangle1.bottom);
        System.out.println("height: " + triangle1.height);
        System.out.println("side1: " + triangle.side1);
        System.out.println("side2: " + triangle.side2);
    }
}
