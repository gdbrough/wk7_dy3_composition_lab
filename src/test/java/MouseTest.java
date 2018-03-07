import Behaviours.IOutput;
import device_management.Monitor;
import device_management.Mouse;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MouseTest {

    private Mouse mouse;

    @Before
    public void setUp() {
        mouse = new Mouse("wired", 3);
    }

    @Test
    public void testCanGetType() {
        assertEquals("wired", mouse.getType());
    }

    @Test
    public void testCanGetButtons() {
        assertEquals(3, mouse.getButtons());
    }

    @Test
    public void testCanClickButton() {
        assertEquals("left mouse button clicked", mouse.clickButton("left"));
    }

    @Test
    public void testCanSendDataToMonitor() {
        IOutput iOutput = new Monitor(22, 786432);
        assertEquals("Pointer moves is now on screen", mouse.sendData("Pointer moves", iOutput));
    }


}
