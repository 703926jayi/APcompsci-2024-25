public class Vehicle extends TaxableItem {
    private double dealerCost;
    private double dealerMarkup;
    private static int vehicleCount = 0;
    private int vehicleID;

    public Vehicle(double dealerCost, double dealerMarkup, double taxRate) {
        super(taxRate);
        this.dealerCost = dealerCost;
        this.dealerMarkup = dealerMarkup;
        vehicleCount++;
        this.vehicleID = vehicleCount;
    }

    public void changeMarkup(double newMarkup) {
        this.dealerMarkup = newMarkup;
    }

    @Override
    public double getListPrice() {
        double listPrice = dealerCost + dealerMarkup;
        if (listPrice > MAX_LIST_PRICE) {
            return 0;
        }
        return listPrice;
    }

    @Override
    public String toString() {
        double listPrice = getListPrice();
        double taxes = listPrice * taxRate;
        double purchasePrice = getPurchasePrice();
        return "Vehicle # " + vehicleID + "\n############\nList price is " + listPrice + "(" + dealerCost + " + " + dealerMarkup + ")\nTaxes " + taxes + "\nPurchase Price is " + purchasePrice;
    }
}
