public class VehicleRunner {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle(20000, 2500, 0.1);
        System.out.println(" --- Vehicle v1 --- ");
        System.out.println(Math.round(v1.getPurchasePrice()) + " (should be 24750)");
        v1.changeMarkup(1000);
        System.out.println(Math.round(v1.getPurchasePrice()) + " (should be 23100)\n");

        System.out.println(" --- Vehicle v2 --- ");
        Vehicle v2 = new Vehicle(95000, 7000, 0.06);
        System.out.println(Math.round(v2.getPurchasePrice()) + " (should be 0) - since list price is > 100,000");
        v2.changeMarkup(4000);
        System.out.println(Math.round(v2.getPurchasePrice()) + " (should be 104940)\n");

        System.out.println(" --- Vehicle v3 --- ");
        Vehicle v3 = new Vehicle(46500, 5000, 0.08);
        System.out.println(Math.round(v3.getPurchasePrice()) + " (should be 55620)");
        System.out.println(v3);
    }
} 
