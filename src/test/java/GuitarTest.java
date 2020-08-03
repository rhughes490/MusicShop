import Items.Guitar;
import Items.Saxophone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar(20, 50, "Walnut", "String", 6);
    }

    @Test
    public void getColour() {
        assertEquals("Walnut", guitar.getColour());
    }

    @Test
    public void setColour() {
        guitar.setColour("Oak");
        assertEquals("Oak", guitar.getColour());
    }

    @Test
    public void getCostPrice() {
        assertEquals(20, guitar.getCostPrice(), 0.01);
    }

    @Test
    public void setCostPrice() {
        guitar.setCostPrice(25);
        assertEquals(25, guitar.getCostPrice(), 0.01);
    }

    @Test
    public void getRetailPrice() {
        assertEquals(50, guitar.getRetailPrice(), 0.01);
    }

    @Test
    public void setRetailPrice() {
        guitar.setRetailPrice(60);
        assertEquals(60, guitar.getRetailPrice(), 0.01);
    }

    @Test
    public void getType() {
        assertEquals("String", guitar.getType());
    }

    @Test
    public void setType() {
        guitar.setType("Plucked String");
        assertEquals("Plucked String", guitar.getType());
    }

    @Test
    public void getNumberOfString() {
        assertEquals(6, guitar.getNumberOfString());
    }

    @Test
    public void setNumberOfString() {
        guitar.setNumberOfString(4);
        assertEquals(4, guitar.getNumberOfString());
    }

    @Test
    public void canPlay() {
        assertEquals("Guitar goes strum, strum", guitar.playInstrument());
    }

}
