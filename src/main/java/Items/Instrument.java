package Items;

import Interfaces.IPlay;

public abstract class Instrument extends Item implements IPlay{

    private String colour;
    private String type;

    public Instrument(double costPrice, double retailPrice, String colour, String type) {
        super(costPrice, retailPrice);
        this.colour = colour;
        this.type = type;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
