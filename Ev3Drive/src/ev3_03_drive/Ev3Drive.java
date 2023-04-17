package ev3_03_drive;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.utility.Delay;

public class Ev3Drive {
    static EV3LargeRegulatedMotor leftMotor;
    static EV3LargeRegulatedMotor rightMotor;
    
    public static void main(String[] args){
        leftMotor = new EV3LargeRegulatedMotor(MotorPort.B);
        rightMotor = new EV3LargeRegulatedMotor(MotorPort.C);
        
        leftMotor.setSpeed(500);
        rightMotor.setSpeed(400);
        
        leftMotor.forward();
        rightMotor.forward();
        Delay.msDelay(2000);
        
        float angle = 180 * (9.3f / 5.6f);
        
        leftMotor.setSpeed(200);
        rightMotor.setSpeed(200);
        
        leftMotor.rotate((int)-angle, true);
        rightMotor.rotate((int)angle, false);
    }
}
