package Shop;

import Interfaces.ISell;

import java.util.ArrayList;

public class Shop {

    private String name;
    private double till;
    private ArrayList<ISell> stock;

    public Shop(String name, double till, ArrayList<ISell> stock) {
        this.name = name;
        this.till = till;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTill() {
        return till;
    }

    public void setTill(double till) {
        this.till = till;
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public void addStock(ISell item) {
        this.stock.add(item);
    }

    public void removeStock(ISell item) {
        this.stock.remove(this.stock.indexOf(item));
    }

    public int numberOfItemsInShop() {
    return this.stock.size();
    }

    public void sellItem(ISell item) {
        this.till += item.getRetailPrice();
        removeStock(item);
    }

    public double totalPotentialProfit() {
        double potentialProfit = 0;
        for (ISell item : this.stock) {
            potentialProfit += item.calculateMarkup();
        }
        return potentialProfit;
    }

}
