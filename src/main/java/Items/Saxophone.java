package Items;

public class Saxophone extends Instrument {

    private int numberOfValves;

    public Saxophone(double costPrice, double retailPrice, String colour, String type, int numberOfValves) {
        super(costPrice, retailPrice, colour, type);
        this.numberOfValves = numberOfValves;
    }

    public int getNumberOfValves() {
        return numberOfValves;
    }

    public void setNumberOfValves(int numberOfValves) {
        this.numberOfValves = numberOfValves;
    }
}
