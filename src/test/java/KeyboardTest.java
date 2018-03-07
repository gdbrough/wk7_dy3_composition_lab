import device_management.Keyboard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KeyboardTest {

    private Keyboard keyboard;

    @Before
    public void setUp() {
        keyboard = new Keyboard("wireless", 102);
    }

    @Test
    public void testCanGetType() {
        assertEquals("wireless", keyboard.getType());
    }

    @Test
    public void testCanGetKeys() {
        assertEquals(102, keyboard.getKeys());
    }
}
