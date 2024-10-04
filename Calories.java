public class Calories {
    public static void main(String[] args) {
        double p =0.0;
        int d =1;
        int c =0;
        int c2 = 0;
        double pt = 0;
        while(pt<25.0){
            c=c+50;
            p = (double)c/3500;
            pt = pt + p;
            c2 = c2 + c;

            d++;
            System.out.println("Day      Calories Burned   Total Punds Lost");
            System.out.println(d+"       "+c2+"              "+(int)(pt*100)/100.0);
        } 
        if (pt >= 25){
            System.out.println("After " + d+ " days, you will burn a total of "+c2+" calories and "+ (int)(pt*100)/100.0+" pounds.");
        }
    }
}
