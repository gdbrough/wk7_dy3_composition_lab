package device_management ;

import Behaviours.IInput;

public class Keyboard extends InputDevice implements IInput{

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
