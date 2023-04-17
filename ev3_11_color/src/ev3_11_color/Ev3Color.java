package ev3_11_color;

import ev3Sensor.ColorSensor;
import ev3Sensor.EV3SensorMode;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.utility.Delay;

public class Ev3Color {
    static Tank tank = new Tank(MotorPort.B, MotorPort.C);
    
    static ColorSensor color = new ColorSensor(SensorPort.S3, EV3SensorMode.REFLECTMODE);
    
    public static void main(String[] args){
        float value = 1;
        
        tank.move(300, 300);
        
        while(value >= 0.4){
            value = color.getValue();
            Delay.msDelay(100);
        }
        
        tank.stop(true, true);
    }
}
