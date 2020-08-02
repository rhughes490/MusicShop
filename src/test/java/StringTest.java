import Items.Strings;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringTest {

    Strings strings;

    @Before
    public void before(){
        strings = new Strings(2, 3, "Guitar", 0.25);
    }

    @Test
    public void getType() {
        assertEquals("Guitar", strings.getType());
    }

    @Test
    public void setType() {
        strings.setType("Violin");
        assertEquals("Violin", strings.getType());
    }

    @Test
    public void getCostPrice() {
        assertEquals(2.00, strings.getCostPrice(), 0.01);
    }

    @Test
    public void setCostPrice() {
        strings.setCostPrice(2.50);
        assertEquals(2.50, strings.getCostPrice(), 0.01);
    }

    @Test
    public void getRetailPrice() {
        assertEquals(3.00, strings.getRetailPrice(), 0.01);
    }

    @Test
    public void setRetailPrice() {
        strings.setRetailPrice(3.50);
        assertEquals(3.50, strings.getRetailPrice(), 0.01);
    }

    @Test
    public void getGauge() {
        assertEquals(0.25, strings.getGauge(), 0.01);
    }

    @Test
    public void setGauge() {
        strings.setGauge(0.26);
        assertEquals(0.26, strings.getGauge(), 0.01);
    }


}
