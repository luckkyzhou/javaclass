package Student;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FullTime extends Student {
    public String type = "fullTime";
    public int examScores;

    public FullTime(String name, int[] quizScores, int examScores){
        super(name, quizScores);
        this.examScores = examScores;
    }

}
