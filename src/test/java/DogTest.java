import org.junit.*;

import static org.junit.Assert.*;


public class DogTest {
    Dog dog;

    @Before
    public void setUp() throws Exception {
        dog = new Dog();
    }

    @Test
    public void TestSound() {
        assertEquals("Meow", dog.sound());
    }

    @Test
    public void TestGetPrice() {
        assertEquals(5, dog.getPrice());
    }

}
