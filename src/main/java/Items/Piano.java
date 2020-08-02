package Items;

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

    public String play(){ return "Piano goes ding, ding";}
}
