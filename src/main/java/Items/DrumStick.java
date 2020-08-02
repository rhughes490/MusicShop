package Items;

public class DrumStick {

    private String make;
    private double weight;

    public DrumStick(String make, double weight) {
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
}
