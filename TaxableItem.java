public abstract class TaxableItem implements Item {
    protected double taxRate;

    public TaxableItem(double taxRate) {
        this.taxRate = taxRate;
    }

    public abstract double getListPrice();

    @Override
    public double getPurchasePrice() {
        double listPrice = getListPrice();
        if (listPrice == 0) {
            return 0;
        }
        return listPrice + (listPrice * taxRate);
    }
}
