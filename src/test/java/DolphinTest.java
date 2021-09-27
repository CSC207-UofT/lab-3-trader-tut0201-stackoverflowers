import org.junit.*;
import static org.junit.Assert.*;
public class DolphinTest {
    Dolphin D;

    @Before
    public void setup() throws Exception {
        D = new Dolphin();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Ee ee!", D.sound());
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(5, D.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        D.upgradeSpeed();
        assertEquals(9, D.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        D.downgradeSpeed();
        assertEquals(1, D.getMaxSpeed());
    }
    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(50, D.getPrice());
    }

}

