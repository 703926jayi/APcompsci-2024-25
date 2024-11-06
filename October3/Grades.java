

public class Grades {
    public static double calculatePassingExamScore(double semesterGrade) {
        double passingGrade = 60.0;
        
        double requiredExamScore = (passingGrade * 5 - semesterGrade * 4);
        
        if (semesterGrade >= passingGrade) {
            return 0.0;
        } else if (requiredExamScore > 100) {
            return -1.0;
        } else {
            return requiredExamScore;
        }
    }


    public static void main(String[] args) {
        System.out.println(calculatePassingExamScore(70.0)); 
        System.out.println(calculatePassingExamScore(35.0)); 
        System.out.println(calculatePassingExamScore(88.0));
    }
}

