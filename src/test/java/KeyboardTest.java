import Behaviours.IOutput;
import device_management.Computer;
import device_management.Keyboard;
import device_management.Monitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KeyboardTest {

    private Computer computer;
//    private IOutput outputDevice;
    private Monitor monitor;
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

    @Test
    public void testCanPressKey() {
        assertEquals("'d' key pressed", keyboard.pressKey("d"));
    }

    @Test
    public void testCanSendDataToMonitor() {
        IOutput iOutput = new Monitor(22, 786432);
        assertEquals("Some random text is now on screen", keyboard.sendData("Some random text", iOutput));
    }
}
