import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle(100);
    }

    @Test
    public void canGetVolume(){
        int volume = waterBottle.getVolume();
        assertEquals(100, volume);
    }

    @Test
    public void canDrink(){
        waterBottle.drink();
        int volume = waterBottle.getVolume();
        assertEquals(90, volume);
    }

    @Test
    public void canHaveMultipleDrinks(){
        waterBottle.drink();
        waterBottle.drink();
        int volume = waterBottle.getVolume();
        assertEquals(80, volume);
    }

    @Test
    public void canEmptyBottle(){
        waterBottle.emptyBottle();
        int volume = waterBottle.getVolume();
        assertEquals(0, volume);
    }

    @Test
    public void canFillBottle(){
        waterBottle.emptyBottle();
        waterBottle.fillBottle();
        int volume = waterBottle.getVolume();
        assertEquals(100, volume);
    }

}
