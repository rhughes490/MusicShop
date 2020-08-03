package Items;

public class SheetMusic extends Item {

    private String type;

    public SheetMusic(double costPrice, double retailPrice, String type) {
        super(costPrice, retailPrice);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double calculateMarkup() {
        return this.retailPrice - this.costPrice;
    }
}
