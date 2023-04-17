package ev3Sensor;

import lejos.hardware.port.Port;

public class GyroSensor extends EV3Sensor {
      
    public GyroSensor(Port port, int mode) {
        super(4, port, mode);
    }
    
    public void reset() {
        super.gyroSensor.reset();
    }

}
