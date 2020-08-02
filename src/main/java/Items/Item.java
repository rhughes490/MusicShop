package Items;

public abstract class Item {

    private double costPrice;
    private double retailPrice;

    public Item(double costPrice, double retailPrice) {
        this.costPrice = costPrice;
        this.retailPrice = retailPrice;
    }

    public double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(double costPrice) {
        this.costPrice = costPrice;
    }

    public double getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(double retailPrice) {
        this.retailPrice = retailPrice;
    }

    public double getProfit() {
        return this.retailPrice - this.costPrice;
    }
}
