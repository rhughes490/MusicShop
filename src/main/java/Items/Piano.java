package Items;

import Interfaces.IPlay;

public class Piano extends Instrument {

    private int numberOfKeys;

    public Piano(double costPrice, double retailPrice, String colour, String type, int numberOfKeys) {
        super(costPrice, retailPrice, colour, type);
        this.numberOfKeys = numberOfKeys;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public void setNumberOfKeys(int numberOfKeys) {
        this.numberOfKeys = numberOfKeys;
    }

    public String playInstrument(){ return "Piano goes ding, ding";}

    public double calculateMarkup() {
        return this.retailPrice - this.costPrice;
    }
}
