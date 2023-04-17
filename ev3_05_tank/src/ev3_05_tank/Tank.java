package ev3_05_tank;

import javax.annotation.PostConstruct;

import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.Port;
import lejos.utility.Delay;

public class Tank {
    EV3LargeRegulatedMotor leftMotor;
    EV3LargeRegulatedMotor rightMotor;
    
    
    public Tank(Port lport, Port rport){
        leftMotor = new EV3LargeRegulatedMotor(lport);
        rightMotor = new EV3LargeRegulatedMotor(rport);
    }
    
    public void MoveFwd(int lSpeed, int rSpeed){
        leftMotor.setSpeed(lSpeed);
        rightMotor.setSpeed(rSpeed);
        
        leftMotor.forward();
        rightMotor.forward();
    }
    
    public void MoveBwd(int lSpeed, int rSpeed){
        leftMotor.setSpeed(lSpeed);
        rightMotor.setSpeed(rSpeed);
        
        leftMotor.backward();
        rightMotor.backward();
    }
    
    public void stop(boolean lRtn, boolean rRtn){
        leftMotor.stop(lRtn);
        rightMotor.stop(rRtn);
    }
    
    public void moveFwdForMs(int lSpeed, int rSpeed, long time){
        this.MoveFwd(lSpeed, rSpeed);
        Delay.msDelay(time);
        this.stop(true, true);
    }
    
    public void move(int lSpeed, int rSpeed){
        leftMotor.setSpeed(lSpeed);
        rightMotor.setSpeed(rSpeed);
    }
}
