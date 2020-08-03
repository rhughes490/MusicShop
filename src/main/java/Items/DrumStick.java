package Items;

public class DrumStick extends Item {

    private String make;
    private double weight;

    public DrumStick(double costPrice, double retailPrice, String make, double weight) {
        super(costPrice, retailPrice);
        this.make = make;
        this.weight = weight;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double calculateMarkup() {
        return this.retailPrice - this.costPrice;
    }
}
