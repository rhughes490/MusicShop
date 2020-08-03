package Items;

import Interfaces.ISell;

public abstract class Item implements ISell {

    protected double costPrice;
    protected double retailPrice;

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

}
