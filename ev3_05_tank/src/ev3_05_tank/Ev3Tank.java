package ev3_05_tank;

import lejos.hardware.port.MotorPort;
import lejos.utility.Delay;

public class Ev3Tank {
    static Tank tank = new Tank(MotorPort.B, MotorPort.C);
    
    public static void main(String[] args){
        
        tank.MoveFwd(500, 500);
        Delay.msDelay(3000);
        tank.stop(true, true);
        
        tank.MoveBwd(500, 500);
        Delay.msDelay(2000);
        tank.stop(true, true);
    }
}
