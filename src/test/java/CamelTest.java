import org.junit.*;

import static org.junit.Assert.*;


public class CamelTest {
    Camel camel;

    @Before
    public void setUp() throws Exception {
        camel = new Camel();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("eEEEeeEEEEEEEGH", camel.sound());
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(5, camel.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        camel.upgradeSpeed();
        assertEquals(6, camel.getMaxSpeed());
    }


    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(10, camel.getPrice());
    }

}