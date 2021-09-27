/*
 * This file contains sample JUnit test cases for Horse.java
 * You should NOT modify this file!
 */

import org.junit.*;

import static org.junit.Assert.*;


public class ElephantTest {
    Elephant e;

    @Before
    public void setUp() throws Exception {
        e = new Elephant();
    }

    @Test(timeout = 100)
    public void TestSound() {
        assertEquals("OOOOH!", e.sound());
    }

    @Test(timeout = 100)
    public void TestGetMaxSpeed() {
        assertEquals(2, e.getMaxSpeed());
    }

    @Test(timeout = 100)
    public void TestUpgradeSpeed() {
        e.upgradeSpeed();
        assertEquals(3,e.getMaxSpeed());
    }

    @Test(timeout = 100)
    public void TestDowngradeSpeed() {
        e.downgradeSpeed();
        assertEquals(1, e.getMaxSpeed());
    }



}
