import java.util.Scanner;
public class Gold {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String plate = s.next();
        int z = plate.charAt(0)+plate.charAt(1)+plate.charAt(2);
        String st = "" + z;
        int y = 0;
        boolean valid = true;
        int total = 0;
        int zc = 0;
        for(int i = 0; i<plate.length();i++){
            if( (i>=0 && i<= 2) && (plate.charAt(i)<65|| plate.charAt(i)>90)){
                System.out.println("invalid license plate");
                valid = false;
                System.exit(0);

                break;
            } else if((i>=3 && i<= 5) && (plate.charAt(i)<48 || plate.charAt(i)>57)){
                System.out.println("invalid license plate");
                valid = false;
                System.exit(0);

                break;
            } else if(plate.length()>6){
                System.out.println("invalid license plate");
                valid = false;
                System.exit(0);

                break;
            }
        }

        if (valid = true){
            y = (plate.charAt(3)-48)*100 + (plate.charAt(4)-48)*10 +(plate.charAt(5)-48);
            System.out.println();
            total = y+ z; 
            if(total>1000){
                total = total-1000;
            }
            zc = (total%26)+65;

            char b = (char) zc;
            if(total<10)
            System.out.println(b+"00"+total);
            else if(total<=100&& total>10){
                System.out.println(b+"0"+total);
            } else {
                System.out.println(b+""+total);
            }
        }


    }
}
