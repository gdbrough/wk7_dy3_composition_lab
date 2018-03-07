package device_management;

import Behaviours.IOutput;

public abstract class InputDevice {

//    Computer computer;
    private String type;

    public InputDevice(String type){
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public String sendData(String input, IOutput iOutput) {
        return iOutput.outputData(input);
    }
}
