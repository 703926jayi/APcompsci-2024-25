import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //future population = starting population * 2.71828^(growth rate * growth time)
        double e = 2.71828;

        System.out.println("Enter initial population");
        double ip = s.nextInt();
        System.out.println("Enter percent growth rate");
        double gr = s.nextDouble();
        double fgr = gr/100;
        System.out.println("Enter time elapsed in years");
        double gt = s.nextDouble();
        double fp = ip*(Math.pow(e, fgr*gt));
        int tfp = (int) (fp+0.5);
        System.out.println(tfp + " people");

    }
}