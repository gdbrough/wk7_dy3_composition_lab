import Behaviours.IInput;
import Behaviours.IOutput;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import device_management.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ComputerTest {
    Computer computer;
    Monitor monitor;
    Keyboard keyboard;
    Printer printer;

    @Before
    public void before() {
        monitor = new Monitor(22, 786432);
        keyboard = new Keyboard("wireless", 102);
        computer = new Computer(8, 512, monitor, keyboard);
        printer = new Printer("Epson", "Stylus", 120, 4);
    }

    @Test
    public void hasRam() {
        assertEquals(8, computer.getRam());
    }

    @Test
    public void hasHddSize() {
        assertEquals(512, computer.getHddSize());
    }

    @Test
    public void hasOutputDevice() {
        IOutput outputDevice = computer.getOutputDevice();
        assertNotNull(outputDevice);
//        assertEquals(22, computer.getMonitor().getScreenSize());
//        assertEquals(786432, computer.getMonitor().getPixels());
    }

    @Test
    public void canOutputData() {
        assertEquals("space invaders is now on screen", computer.outputData("space invaders"));
    }

    @Test
    public void testCanOutputViaPrinter() {
//        Printer printer = new Printer("Epson", "Stylus", 120, 4);
        Computer computer2 = new Computer(8, 512, printer, keyboard);
        assertEquals("printing: space invaders", computer2.outputData("space invaders"));
    }

    @Test
    public void testCanOutputDataViaSpeaker() {
        Speaker speaker = new Speaker(100);
        Computer computer3 = new Computer(8, 512, speaker, keyboard);
        assertEquals("playing: Beep!", computer3.outputData("Beep!"));
    }

    @Test
    public void testCanSetOutputDevice() {
//        Printer printer = new Printer("Epson", "Stylus", 120, 4);
        computer.setOutputDevice(printer);
        assertEquals("printing: space invaders", computer.outputData("space invaders"));
    }



    @Test
    public void hasInputDevice() {
        IInput inputDevice = computer.getInputDevice();
        assertNotNull(inputDevice);
    }

//    @Test
//    public void testCanSetInputDevice() {
//        computer.setInputDevice(keyboard);
//        computer.setOutputDevice(monitor);
////        assertEquals("printing: space invaders", computer.outputData("space invaders"));
//        assertEquals("Some random text is now on screen", inputDevice.sendData("Some random text", outputDevice));
//    }
}
