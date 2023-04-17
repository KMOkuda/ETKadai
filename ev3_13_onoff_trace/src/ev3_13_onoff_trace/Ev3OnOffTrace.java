package ev3_13_onoff_trace;

import ev3Sensor.ColorSensor;
import ev3Sensor.EV3SensorMode;
import ev3Sensor.UltraSonicSensor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;

public class Ev3OnOffTrace {

    static Tank tank = new Tank(MotorPort.B, MotorPort.C);
    static ColorSensor color = new ColorSensor(SensorPort.S3, EV3SensorMode.REFLECTMODE);
    static UltraSonicSensor us = new UltraSonicSensor(SensorPort.S1, EV3SensorMode.DISTANCEMODE);
    
    public static void main(String[] args){
        float center = 0.35f;
        float kp = 0.75f;
        float mv;
        
        float mSp = 300;
        float lSpeed, rSpeed;
        
        while(true){
            
            if(us.getValue() >= 0.7){
                tank.stop(true, true);
                break;
            }
            
            mv = kp*(center - color.getValue());
            
            if(mv == 0){
                lSpeed = mSp;
                rSpeed = mSp;
            }else if(mv > 0){
                lSpeed = mSp;
                rSpeed = mSp - (mSp * Math.abs(mv) * 2);
            }else{
                lSpeed = mSp - (mSp * Math.abs(mv) * 2);
                rSpeed = mSp;
            }
            
            tank.move((int)lSpeed, (int)rSpeed);
        }
    }
}
