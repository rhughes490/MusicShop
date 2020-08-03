import Items.Piano;
import Items.Saxophone;
import Items.Strings;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano(500, 1000,"Red", "Baby Grand", 24);
    }

    @Test
    public void getColour() {
        assertEquals("Red", piano.getColour());
    }

    @Test
    public void setColour() {
        piano.setColour("Yellow");
        assertEquals("Yellow", piano.getColour());
    }

    @Test
    public void getCostPrice() {
        assertEquals(500, piano.getCostPrice(), 0.01);
    }

    @Test
    public void setCostPrice() {
        piano.setCostPrice(600);
        assertEquals(600, piano.getCostPrice(), 0.01);
    }

    @Test
    public void getRetailPrice() {
        assertEquals(1000, piano.getRetailPrice(), 0.01);
    }

    @Test
    public void setRetailPrice() {
        piano.setRetailPrice(1100);
        assertEquals(1100, piano.getRetailPrice(), 0.01);
    }

    @Test
    public void getType() {
        assertEquals("Baby Grand", piano.getType());
    }

    @Test
    public void setType() {
        piano.setType("Grand");
        assertEquals("Grand", piano.getType());
    }

    @Test
    public void getNumberOfKeys() {
        assertEquals(24, piano.getNumberOfKeys());
    }

    @Test
    public void setNumberOfKeys() {
        piano.setNumberOfKeys(26);
        assertEquals(26, piano.getNumberOfKeys());
    }

    @Test
    public void canPlay() {
        assertEquals("Piano goes ding, ding", piano.playInstrument());
    }

}
