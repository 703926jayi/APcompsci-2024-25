import java.util.Scanner;
public class Gold {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        long cardl = s1.nextLong();
        Double cardDou = (double) cardl;
        Double cardD = cardDou/10000000;
        double x = 0.0;
        long d1 = cardl % 10;
        long d2 = (cardl % 100)/10;
        long d3 = (cardl % 1000)/100;
        long d4 = (cardl % 10000)/1000;
        long d5 = (cardl % 100000)/10000;
        long d6 = (cardl % 1000000)/100000;
        long d7 = (cardl % 10000000)/1000000;
        long d8 = (cardl % 100000000)/10000000;
        long d9 = (cardl % 1000000000)/100000000;
        long cardz = cardl / 1000000000;
        long d10 = cardz % 10;
        long d11 = (cardz % 100) / 10;
        long d12 = (cardz % 1000) / 100;
        long d13 = (cardz % 10000) / 1000;
        long d14 = (cardz % 100000) / 10000;
        long d15 = (cardz % 1000000) / 100000;
        long d16 = (cardz % 10000000) / 1000000;
        if(d16 == 4){
            System.out.println("Visa");
        } else if(d16 == 5){
            System.out.println("Mastercard");
        } else if(d16 == 3 && d15 == 7){
            System.out.println("American Express");
        } else if(d16 == 6){
            System.out.println("Discover");
        } else if(d15 == 5){
            System.out.println("Mastercard");
        }else{
            System.out.println("Unrecognized Card Type");
            x = 1.0;
        }
        if(d2*2 > 9){
            d2 = d2*2-9;
        } else{
            d2 = d2*2;
        }
        if(d4*2 > 9){
            d4 = d4*2-9;
        } else{
            d4 = d4*2;
        }
        if(d6*2 > 9){
            d6 = d6*2-9;
        } else{
            d6 = d6*2;
        }
        if(d8*2 > 9){
            d8 = d8*2-9;
        } else{
            d8 = d8*2;
        }
        if(d10*2 > 9){
            d10 = d10*2-9;
        } else {
            d10 =d10*2;
        }
        if(d12*2 > 9){
            d12 = d12*2-9;
        } else{
            d12 = d12*2;
        }
        if(d14*2 > 9){
            d14 = d14*2-9;
        } else{
            d14 = d14*2;
        }
        if(d16*2 > 9){
            d16 = d16*2-9;
        } else {
            d16 = d16*2;
        }
        if (cardD >= 1000000000 || cardD <=100000000){
            System.out.println("Invalid");
            System.out.println("Number of Digits");
        } else if( x != 0 ){
            System.out.println("Invalid");
            System.out.println("Invalid Card Type");
        } else if((d2+d3+d4+d5+d6+d7+d8+d9+d10+d11+d12+d13+d14+d15+d16)%10 != d1){
            System.out.println("Invalid");
            System.out.println("Validation Process");
        } else {
            System.out.println("Valid");
        }
       

    }
}
