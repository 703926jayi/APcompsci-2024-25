import java.util.Scanner;
public class Silver
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double absences = s.nextInt();
        double semesterGrade = s.nextDouble();
        double examScore = s.nextDouble();
        double finalGrade = (semesterGrade * 4 + examScore) / 5;
     if(finalGrade < 59.5 && absences <= 10 && semesterGrade >59.5){
     System.out.println("E");
    } else if (finalGrade >= 59.5 && finalGrade < 62.5 && absences <10){
    System.out.println("D-");
    } else if(finalGrade >= 59.5 && finalGrade < 62.5 && absences <10){
     System.out.println("D-");
     } else if(finalGrade >= 62.5 && finalGrade < 66.5){
        System.out.println("D");
    } else if(finalGrade >= 66.5 && finalGrade < 69.5 ){
        System.out.println("D+");
    } else if(finalGrade >= 69.5 && finalGrade < 72.5){
        System.out.println("C-");
    } else if(finalGrade >= 72.5 && finalGrade < 76.5){
        System.out.println("C");
    } else if(finalGrade >= 76.5 && finalGrade < 79.5){
        System.out.println("C+");
    } else if(finalGrade >= 79.5 && finalGrade < 82.5 && absences <10){
        System.out.println("B-");
    } else if(finalGrade >= 82.5 && finalGrade < 86.5){
        System.out.println("B");
    } else if(finalGrade >= 86.5 && finalGrade < 89.5){
        System.out.println("B+");
    } else if(finalGrade >= 89.5 && finalGrade < 92.5){
        System.out.println("A-");
    } else if(finalGrade >= 92.5){
        System.out.println("A");
    } 
    if(absences < 10 && finalGrade > 59.5){
        System.out.println("1a");
      } else if(absences < 10 && finalGrade < 59.5 && examScore>=77){
        System.out.println("EA");
        System.out.println("1b");
      } else if(absences < 10 && finalGrade < 59.5 && examScore<77){
        System.out.println("E");
        System.out.println("1c");
      }
    if(absences >= 10 && semesterGrade >59.5 && examScore >= 77){
        System.out.println("2a");
    } else if(absences >= 10 && semesterGrade <59.5 && examScore >= 77){
        System.out.println("EA");
        System.out.println("2b");
    } else if(absences >= 10 && semesterGrade >59.5 && examScore < 77){
        System.out.println("EA");
        System.out.println("2c");
    } else if(absences >= 10 && semesterGrade <59.5 && examScore <= 77){
        System.out.println("E");
        System.out.println("2d");
    }
    }
}
