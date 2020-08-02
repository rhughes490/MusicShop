import Items.SheetMusic;
import Items.Strings;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void before(){
        sheetMusic = new SheetMusic(0.1, 0.2, "Classical");
    }

    @Test
    public void getType() {
        assertEquals("Classical", sheetMusic.getType());
    }

    @Test
    public void setType() {
        sheetMusic.setType("Jazz");
        assertEquals("Jazz", sheetMusic.getType());
    }

    @Test
    public void getCostPrice() {
        assertEquals(0.1, sheetMusic.getCostPrice(), 0.01);
    }

    @Test
    public void setCostPrice() {
        sheetMusic.setCostPrice(0.15);
        assertEquals(0.15, sheetMusic.getCostPrice(), 0.01);
    }

    @Test
    public void getRetailPrice() {
        assertEquals(0.2, sheetMusic.getRetailPrice(), 0.01);
    }

    @Test
    public void setRetailPrice() {
        sheetMusic.setRetailPrice(0.25);
        assertEquals(0.25, sheetMusic.getRetailPrice(), 0.01);
    }

}

