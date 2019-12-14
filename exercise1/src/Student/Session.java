package Student;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Session{
    private HashMap<String, int[]> quizScoresMap;
    private ArrayList partStudents;
    private String name;
    private String type;
    private int[] quizScores;
    private int examScores;
    private HashMap<String, Integer> examScoresMap;

    public void addQuizScores(){
        quizScoresMap.put(name, quizScores);
    }

    public void addExamScores(){
        if (type.equals("fullTime")) {
            examScoresMap.put(name, examScores);
        }
    }

    public void addPartTime(){
        if (type.equals("partTime")){
            partStudents.add(name);
        }
    }

    public void calculateAverage(){
        for (String key: quizScoresMap.keySet()){
            int sum = 0;
            int [] arr = quizScoresMap.get(key);
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }
            float average = (float) (sum / arr.length);
            System.out.println("The average quiz score of " + key + " is " + average);
        }
    }

    public void printAscending(){
        for (String key: quizScoresMap.keySet()){
            int [] arr = quizScoresMap.get(key);
            Arrays.sort(arr);
            System.out.println(key + "'s quiz scores are " + Arrays.toString(arr));
        }
    }

    public void printPartTime(){
        System.out.println("Part-time students are:" + partStudents);
    }

    public void printExamScores(){
        for (String key: examScoresMap.keySet()){
            System.out.println(key + "'s exam score is " + examScoresMap.get(key));
        }
    }

    public Session(String name, String type, int[] quizScores, int examScores, HashMap<String, Integer> examScoresMap, HashMap quizScoresMap, ArrayList partStudents){
        this.name = name;
        this.type = type;
        this.quizScores = quizScores;
        this.examScoresMap = examScoresMap;
        this.examScores = examScores;
        this.quizScoresMap = quizScoresMap;
        this.partStudents = partStudents;
    }

    public static void main(String[] args){
        HashMap<String, int[]> quizScoresMap = new HashMap<>();
        HashMap<String, Integer> examScoresMap = new HashMap<>();
        ArrayList partStudents = new ArrayList();

        PartTime stu1 = new PartTime("Alice", new int[]{67, 75, 98, 95, 90, 93, 60, 74, 88, 79, 70, 61, 95, 77, 85});
        PartTime stu2 = new PartTime("Paul", new int[]{83, 63, 98, 92, 71, 88, 99, 77, 99, 79, 84, 85, 85, 74, 61});
        PartTime stu3 = new PartTime("Adam", new int[]{86, 60, 91, 75, 72, 83, 83, 86, 95, 65, 66, 97, 90, 94, 67});
        PartTime stu4 = new PartTime("Bob", new int[]{98, 65, 73, 66, 86, 88, 60, 89, 78, 92, 64, 63, 96, 84, 81});
        PartTime stu5 = new PartTime("Ethan", new int[]{92, 65, 77, 70, 83, 86, 67, 75, 76, 78, 73, 69, 77, 79, 65});
        PartTime stu6 = new PartTime("Gaby", new int[]{66, 68, 63, 76, 81, 62, 90, 98, 98, 74, 63, 82, 79, 97, 65});
        PartTime stu7 = new PartTime("Bill", new int[]{64, 70, 63, 66, 65, 89, 66, 91, 72, 94, 95, 96, 100, 80, 68});
        PartTime stu8 = new PartTime("Billy", new int[]{72, 83, 71, 64, 79, 91, 77, 82, 80, 91, 81, 83, 100, 95, 80});
        PartTime stu9 = new PartTime("Nick", new int[]{76, 99, 93, 90, 84, 64, 76, 68, 91, 90, 84, 95, 89, 73, 92});
        PartTime stu10 = new PartTime("Noah", new int[]{80, 60, 80, 75, 64, 85, 65, 67, 72, 70, 60, 92, 81, 88, 96});
        PartTime stu11 = new PartTime("Gaby", new int[]{68, 97, 62, 82, 80, 77, 66, 79, 72, 90, 64, 95, 80, 75, 87});
        PartTime stu12 = new PartTime("Bill", new int[]{94, 83, 82, 93, 80, 78, 89, 84, 89, 93, 91, 70, 62, 92, 62});
        PartTime stu13 = new PartTime("Billy", new int[]{89, 88, 83, 97, 86, 98, 97, 73, 61, 63, 60, 96, 78, 95, 79});
        PartTime stu14 = new PartTime("Nick", new int[]{78, 82, 69, 80, 74, 78, 85, 72, 100, 100, 98, 64, 67, 70, 83});
        PartTime stu15 = new PartTime("Noah", new int[]{76, 84, 72, 63, 94, 65, 97, 63, 75, 70, 69, 64, 92, 75, 78});
        FullTime stu16 = new FullTime("Eva", new int[]{93, 72, 89, 89, 91, 76, 82, 84, 88, 73, 85, 68, 79, 70, 78}, 85);
        FullTime stu17 = new FullTime("Claudia", new int[]{86, 64, 95, 83, 70, 72, 82, 77, 61, 95, 76, 61, 69, 78, 74}, 94);
        FullTime stu18 = new FullTime("Daisy", new int[]{96, 64, 99, 70, 80, 61, 89, 99, 90, 64, 95, 77, 95, 74, 96}, 92);
        FullTime stu19 = new FullTime("Kathy", new int[]{65, 71, 72, 61, 74, 85, 71, 82, 81, 85, 98, 63, 85, 71, 96}, 96);
        FullTime stu20 = new FullTime("Lydia", new int[]{66, 86, 67, 75, 84, 69, 60, 76, 94, 86, 61, 67, 90, 65, 93}, 88);

        Session session1 = new Session(stu1.name,stu1.type,stu1.quizScores,0,examScoresMap,quizScoresMap,partStudents);
        session1.addQuizScores();
        session1.addPartTime();
        Session session2 = new Session(stu2.name,stu2.type,stu2.quizScores,0,examScoresMap,quizScoresMap,partStudents);
        session2.addQuizScores();
        session2.addPartTime();
        Session session3 = new Session(stu3.name,stu3.type,stu3.quizScores,0,examScoresMap,quizScoresMap,partStudents);
        session3.addQuizScores();
        session3.addPartTime();
        Session session4 = new Session(stu4.name,stu4.type,stu4.quizScores,0,examScoresMap,quizScoresMap,partStudents);
        session4.addQuizScores();
        session4.addPartTime();
        Session session5 = new Session(stu5.name,stu5.type,stu5.quizScores,0,examScoresMap,quizScoresMap,partStudents);
        session5.addQuizScores();
        session5.addPartTime();
        Session session6 = new Session(stu6.name,stu6.type,stu6.quizScores,0,examScoresMap,quizScoresMap,partStudents);
        session6.addQuizScores();
        session6.addPartTime();
        Session session7 = new Session(stu7.name,stu7.type,stu7.quizScores,0,examScoresMap,quizScoresMap,partStudents);
        session7.addQuizScores();
        session7.addPartTime();
        Session session8 = new Session(stu8.name,stu8.type,stu8.quizScores,0,examScoresMap,quizScoresMap,partStudents);
        session8.addQuizScores();
        session8.addPartTime();
        Session session9 = new Session(stu9.name,stu9.type,stu9.quizScores,0,examScoresMap,quizScoresMap,partStudents);
        session9.addQuizScores();
        session9.addPartTime();
        Session session10 = new Session(stu10.name,stu10.type,stu10.quizScores,0,examScoresMap,quizScoresMap,partStudents);
        session10.addQuizScores();
        session10.addPartTime();
        Session session11 = new Session(stu11.name,stu11.type,stu11.quizScores,0,examScoresMap,quizScoresMap,partStudents);
        session11.addQuizScores();
        session11.addPartTime();
        Session session12 = new Session(stu12.name,stu12.type,stu12.quizScores,0,examScoresMap,quizScoresMap,partStudents);
        session12.addQuizScores();
        session12.addPartTime();
        Session session13 = new Session(stu13.name,stu13.type,stu13.quizScores,0,examScoresMap,quizScoresMap,partStudents);
        session13.addQuizScores();
        session13.addPartTime();
        Session session14 = new Session(stu14.name,stu14.type,stu14.quizScores,0,examScoresMap,quizScoresMap,partStudents);
        session14.addQuizScores();
        session14.addPartTime();
        Session session15 = new Session(stu15.name,stu15.type,stu15.quizScores,0,examScoresMap,quizScoresMap,partStudents);
        session15.addQuizScores();
        session15.addPartTime();
        Session session16 = new Session(stu16.name,stu16.type,stu16.quizScores,stu16.examScores,examScoresMap,quizScoresMap,partStudents);
        session16.addQuizScores();
        session16.addExamScores();
        Session session17 = new Session(stu17.name,stu17.type,stu17.quizScores,stu17.examScores,examScoresMap,quizScoresMap,partStudents);
        session17.addQuizScores();
        session17.addExamScores();
        Session session18 = new Session(stu18.name,stu18.type,stu18.quizScores,stu18.examScores,examScoresMap,quizScoresMap,partStudents);
        session18.addQuizScores();
        session18.addExamScores();
        Session session19 = new Session(stu19.name,stu19.type,stu19.quizScores,stu19.examScores,examScoresMap,quizScoresMap,partStudents);
        session19.addQuizScores();
        session19.addExamScores();
        Session session20 = new Session(stu20.name,stu20.type,stu20.quizScores,stu20.examScores,examScoresMap,quizScoresMap,partStudents);
        session20.addQuizScores();
        session20.addExamScores();

        session20.calculateAverage();
        session20.printAscending();
        session20.printPartTime();
        session20.printExamScores();
    }
}
