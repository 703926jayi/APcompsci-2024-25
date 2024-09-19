import java.util.Scanner;
public class Quiz {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int dice3 = (int)(Math.random()*6)+1;
        int dice2 = (int)(Math.random()*6)+1;
        int dice1 = (int)(Math.random()*6)+1;
        int z = dice3;
        int y = dice2;
        if (dice3 >= dice2 && dice2 >= dice1){
            dice3 = dice3;
            dice2 = dice2;
            dice1 = dice1;
        } else if(dice2 >= dice3 && dice3 >= dice1){
            dice3 = dice2;
            dice2 = z;
        } else if(dice1 >= dice2 && dice2 >= dice3){
            dice3 = dice1;
            dice1 = z;
        } else if(dice2 >= dice1 && dice1 >= dice3){
            dice3 = dice2;
            dice2 = dice1;
            dice1 = z;
        } else if(dice3 >= dice1 && dice1 >= dice2){
            dice2 = dice1;
            dice1 = y;
        } 
        System.out.println(dice1 + " " + dice2 + " " + dice3);
        System.out.println("Reroll die?");
        int ans = s.nextInt();
        if(ans == 1){
            dice1 = (int)(Math.random()*6)+1;
        } else if(ans ==2) {
            dice2 = (int)(Math.random()*6)+1;
        } else if(ans ==3) {
            dice3 = (int)(Math.random()*6)+1;
        } else if(ans != 1 && ans != 2 && ans != 3){
            System.out.println("No rerolls needed");
        }
        if(dice1 <= dice2 && dice2 <= dice3){
        } else if(dice2 >= dice3 && dice3 >= dice1){
            dice3 = dice2;
            dice2 = z;
        } else if(dice1 >= dice2 && dice2 >= dice3){
            dice3 = dice1;
            dice1 = z;
        } else if(dice2 >= dice1 && dice1 >= dice3){
            dice3 = dice2;
            dice2 = dice1;
            dice1 = z;
        } else if(dice3 >= dice1 && dice1 >= dice2){
            dice2 = dice1;
            dice1 = y;
        } 
        System.out.println("Results");
        System.out.println(dice1 + " " + dice2 + " " + dice3);
        if(dice3 == dice2 && dice1 == dice3 && dice1 == 6){
            System.out.println("Super Yahtzee");
        } else if(dice3 == dice2 && dice1 == dice3){
            System.out.println("Yahtzee");
        } else if(dice3 == 1 && dice2 ==2 && dice1 == 3 || dice3 == 2 && dice2 ==3 && dice1 == 4 || dice3 == 3 && dice2 ==4 && dice1 == 5 || dice3 == 4 && dice2 ==5 && dice1 == 6  ){
            System.out.println("Straight");
        } else if(dice3 % 2 ==1 && dice2 % 2 == 1 && dice1 % 2 ==1){
            System.out.println("That's odd");
        } else if(dice3 + dice2 == 7 || dice2 + dice1 == 7 || dice1 + dice3 ==7){
            System.out.println("Crappy");
        } else {
            System.out.println("Sum: " + (dice3 +dice2 +dice1));
        }
    }
}
