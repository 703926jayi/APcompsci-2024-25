import java.util.Scanner;
public class Exercise35 {
public static void main(String [] args)
 {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter today's day:");
    int day = s.nextInt();
    System.out.println("Enter the number of days elapsed since today:");
    int eday = s.nextInt();
    int tday = (day + eday);
    if (day % 7 == 0 && tday % 7 == 0){
        System.out.println("Today is Sunday and the future day is Sunday");
    } else if (day % 7 == 0 && tday % 7 == 1){
        System.out.println("Today is Sunday and the future day is Monday");
    } else if (day % 7 == 0 && tday % 7 == 2){
        System.out.println("Today is Sunday and the future day is Tuesday");
    } else if (day % 7 == 0 && tday % 7 == 3){
        System.out.println("Today is Sunday and the future day is Wednesday");
    } else if (day % 7 == 0 && tday % 7 == 4){
        System.out.println("Today is Sunday and the future day is Thursday");
    } else if (day % 7 == 0 && tday % 7 == 5){
        System.out.println("Today is Sunday and the future day is Friday");
    } else if (day % 7 == 0 && tday % 7 == 6){
        System.out.println("Today is Sunday and the future day is Saturday");
    } else if (day % 7 == 1 && tday % 7 == 0){
        System.out.println("Today is Monday and the future day is Sunday");
    } else if (day % 7 == 1 && tday % 7 == 1){
        System.out.println("Today is Monday and the future day is Monday");
    } else if (day % 7 == 1 && tday % 7 == 2){
        System.out.println("Today is Monday and the future day is Tuesday");
    } else if (day % 7 == 1 && tday % 7 == 3){
        System.out.println("Today is Monday and the future day is Wednesday");
    } else if (day % 7 == 1 && tday % 7 == 4){
        System.out.println("Today is Monday and the future day is Thursday");
    } else if (day % 7 == 1 && tday % 7 == 5){
        System.out.println("Today is Monday and the future day is Friday");
    } else if (day % 7 == 1 && tday % 7 == 6){
        System.out.println("Today is Monday and the future day is Saturday");
    } else if (day % 7 == 2 && tday % 7 == 0){
        System.out.println("Today is Tuesday and the future day is Sunday");
    } else if (day % 7 == 2 && tday % 7 == 1){
        System.out.println("Today is Tuesday and the future day is Monday");
    } else if (day % 7 == 2 && tday % 7 == 2){
        System.out.println("Today is Tuesday and the future day is Tuesday");
    } else if (day % 7 == 2 && tday % 7 == 3){
        System.out.println("Today is Tuesday and the future day is Wednesday");
    } else if (day % 7 == 2 && tday % 7 == 4){
        System.out.println("Today is Tuesday and the future day is Thursday");
    } else if (day % 7 == 2 && tday % 7 == 5){
        System.out.println("Today is Tuesday and the future day is Friday");
    } else if (day % 7 == 2 && tday % 7 == 6){
        System.out.println("Today is Tuesday and the future day is Saturday");
    } else if (day % 7 == 3 && tday % 7 == 0){
        System.out.println("Today is Wednesday and the future day is Sunday");
    } else if (day % 7 == 3 && tday % 7 == 1){
        System.out.println("Today is Wednesday and the future day is Monday");
    } else if (day % 7 == 3 && tday % 7 == 2){
        System.out.println("Today is Wednesday and the future day is Tuesday");
    } else if (day % 7 == 3 && tday % 7 == 3){
        System.out.println("Today is Wednesday and the future day is Wednesday");
    } else if (day % 7 == 3 && tday % 7 == 4){
        System.out.println("Today is Wednesday and the future day is Thursday");
    } else if (day % 7 == 3 && tday % 7 == 5){
        System.out.println("Today is Wednesday and the future day is Friday");
    } else if (day % 7 == 3 && tday % 7 == 6){
        System.out.println("Today is Wednesday and the future day is Saturday");
    } else if (day % 7 == 4 && tday % 7 == 0){
        System.out.println("Today is Thursday and the future day is Sunday");
    } else if (day % 7 == 4 && tday % 7 == 1){
        System.out.println("Today is Thursday and the future day is Monday");
    } else if (day % 7 == 4 && tday % 7 == 2){
        System.out.println("Today is Thursday and the future day is Tuesday");
    } else if (day % 7 == 4 && tday % 7 == 3){
        System.out.println("Today is Thursday and the future day is Wednesday");
    } else if (day % 7 == 4 && tday % 7 == 4){
        System.out.println("Today is Thursday and the future day is Thursday");
    } else if (day % 7 == 4 && tday % 7 == 5){
        System.out.println("Today is Thursday and the future day is Friday");
    } else if (day % 7 == 4 && tday % 7 == 6){
        System.out.println("Today is Thursday and the future day is Saturday");
    } else if (day % 7 == 5 && tday % 7 == 0){
        System.out.println("Today is Friday and the future day is Sunday");
    } else if (day % 7 == 5 && tday % 7 == 1){
        System.out.println("Today is Friday and the future day is Monday");
    } else if (day % 7 == 5 && tday % 7 == 2){
        System.out.println("Today is Friday and the future day is Tuesday");
    } else if (day % 7 == 5 && tday % 7 == 3){
        System.out.println("Today is Friday and the future day is Wednesday");
    } else if (day % 7 == 5 && tday % 7 == 4){
        System.out.println("Today is Friday and the future day is Thursday");
    } else if (day % 7 == 5 && tday % 7 == 5){
        System.out.println("Today is Friday and the future day is Friday");
    } else if (day % 7 == 5 && tday % 7 == 6){
        System.out.println("Today is Friday and the future day is Saturday");
    } else if (day % 7 == 6 && tday % 7 == 0){
        System.out.println("Today is Saturday and the future day is Sunday");
    } else if (day % 7 == 6 && tday % 7 == 1){
        System.out.println("Today is Saturday and the future day is Monday");
    } else if (day % 7 == 6 && tday % 7 == 2){
        System.out.println("Today is Saturday and the future day is Tuesday");
    } else if (day % 7 == 6 && tday % 7 == 3){
        System.out.println("Today is Saturday and the future day is Wednesday");
    } else if (day % 7 == 6 && tday % 7 == 4){
        System.out.println("Today is Saturday and the future day is Thursday");
    } else if (day % 7 == 6 && tday % 7 == 5){
        System.out.println("Today is Saturday and the future day is Friday");
    } else if (day % 7 == 6 && tday % 7 == 6){
        System.out.println("Today is Saturday and the future day is Saturday");
    }
 }
}
