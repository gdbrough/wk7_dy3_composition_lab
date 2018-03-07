package device_management;

public class Keyboard extends InputDevice {

    private int keys;

    public Keyboard(String type, int keys) {
        super(type);
        this.keys = keys;
    }

    public int getKeys() {
        return keys;
    }

    public String pressKey(String key) {
        return "'" + key + "' key pressed";
    }
}
