package ev3_10_touch;

import ev3Sensor.EV3SensorMode;
import ev3Sensor.TouchSensor;
import lejos.hardware.lcd.LCD;
import lejos.hardware.port.SensorPort;
import lejos.utility.Delay;

public class Touch {
    static TouchSensor touchSensor = new TouchSensor(SensorPort.S1, EV3SensorMode.TOUCHMODE);
    
    public static void main(String[] args){
        float value;
        
        while(true){
            value = touchSensor.getValue();
            
            if(value == 1){
                LCD.drawString("On", 1, 1);
            }else{
                LCD.clear();
            }
            
            Delay.msDelay(200);
        }
    }
}
