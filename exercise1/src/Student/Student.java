package Student;

public class Student {
    public String name;
    public int[] quizScores;

    public void study(){
        System.out.println(name);
    }

    public Student(String name, int[] quizScores){
        this.name = name;
        this.quizScores = quizScores;
    }
}

