package Items;

public class Strings {

    private String type;
    private double gauge;

    public Strings(String type, double gauge) {
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
