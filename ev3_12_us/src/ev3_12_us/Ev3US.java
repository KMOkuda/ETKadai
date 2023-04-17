package ev3_12_us;

import ev3Sensor.EV3SensorMode;
import ev3Sensor.UltraSonicSensor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.utility.Delay;

public class Ev3US {
    static Tank tank = new Tank(MotorPort.B, MotorPort.C);
    
    static UltraSonicSensor us = new UltraSonicSensor(SensorPort.S1, EV3SensorMode.DISTANCEMODE);
    
    public static void main(String[] args){
        float value = 1;
        
        tank.move(300, 300);
        
        while(value >= 0.2){
            value = us.getValue();
            Delay.msDelay(100);
        }
        
        tank.stop(true, true);
    }
}
