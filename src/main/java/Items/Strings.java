package Items;

public class Strings extends Item {

    private String type;
    private double gauge;

    public Strings(double costPrice, double retailPrice, String type, double gauge) {
        super(costPrice, retailPrice);
        this.type = type;
        this.gauge = gauge;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getGauge() {
        return gauge;
    }

    public void setGauge(double gauge) {
        this.gauge = gauge;
    }
}
