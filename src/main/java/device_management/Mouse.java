package device_management;

public class Mouse extends InputDevice {

    private int buttons;

    public Mouse(String type, int buttons) {
        super(type);
        this.buttons = buttons;
    }

    public int getButtons() {
        return buttons;
    }

    public String clickButton(String button) {
        return button + " mouse button clicked";
    }
}
