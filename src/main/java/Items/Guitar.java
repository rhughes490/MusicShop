package Items;

public class Guitar extends Instrument {

    private int numberOfString;

    public Guitar(double costPrice, double retailPrice, String colour, String type, int numberOfString) {
        super(costPrice, retailPrice, colour, type);
        this.numberOfString = numberOfString;
    }

    public int getNumberOfString() {
        return numberOfString;
    }

    public void setNumberOfString(int numberOfString) {
        this.numberOfString = numberOfString;
    }

    public String playInstrument(){ return "Guitar goes strum, strum";}

    public double calculateMarkup() {
        return this.retailPrice - this.costPrice;
    }
}
