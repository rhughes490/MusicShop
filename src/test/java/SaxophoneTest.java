import Items.Saxophone;
import Items.Strings;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxophoneTest {

        Saxophone saxophone;

        @Before
        public void before(){
            saxophone = new Saxophone(200, 300, "Gold", "Brass", 6);
        }

        @Test
        public void getColour() {
            assertEquals("Gold", saxophone.getColour());
        }

        @Test
        public void setColour() {
            saxophone.setColour("Yellow");
            assertEquals("Yellow", saxophone.getColour());
        }

        @Test
        public void getCostPrice() {
            assertEquals(200, saxophone.getCostPrice(), 0.01);
        }

        @Test
        public void setCostPrice() {
            saxophone.setCostPrice(250);
            assertEquals(250, saxophone.getCostPrice(), 0.01);
        }

        @Test
        public void getRetailPrice() {
            assertEquals(300, saxophone.getRetailPrice(), 0.01);
        }

        @Test
        public void setRetailPrice() {
            saxophone.setRetailPrice(350);
            assertEquals(350, saxophone.getRetailPrice(), 0.01);
        }

        @Test
        public void getType() {
            assertEquals("Brass", saxophone.getType());
        }

        @Test
        public void setType() {
            saxophone.setType("Woodwind");
            assertEquals("Woodwind", saxophone.getType());
        }

        @Test
        public void getNumberOfValves() {
            assertEquals(6, saxophone.getNumberOfValves());
        }

        @Test
        public void setNumberOfValves() {
            saxophone.setNumberOfValves(8);
            assertEquals(8, saxophone.getNumberOfValves());
        }

}
