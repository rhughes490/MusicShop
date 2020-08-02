import Items.DrumStick;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumStickTest {

    DrumStick drumStick;

    @Before
    public void before(){
        drumStick = new DrumStick(3, 5, "Yamaha", 7);
    }

    @Test
    public void getMake() {
        assertEquals("Yamaha", drumStick.getMake());
    }

    @Test
    public void setMake() {
        drumStick.setMake("Tama");
        assertEquals("Tama", drumStick.getMake());
    }

    @Test
    public void getCostPrice() {
        assertEquals(3.00, drumStick.getCostPrice(), 0.01);
    }

    @Test
    public void setCostPrice() {
        drumStick.setCostPrice(3.50);
        assertEquals(3.50, drumStick.getCostPrice(), 0.01);
    }

    @Test
    public void getRetailPrice() {
        assertEquals(5.00, drumStick.getRetailPrice(), 0.01);
    }

    @Test
    public void setRetailPrice() {
        drumStick.setRetailPrice(3.50);
        assertEquals(3.50, drumStick.getRetailPrice(), 0.01);
    }

    @Test
    public void getWeight() {
        assertEquals(7, drumStick.getWeight(), 0.01);
    }

    @Test
    public void setWeight() {
        drumStick.setWeight(5);
        assertEquals(5, drumStick.getWeight(), 0.01);
    }


}

