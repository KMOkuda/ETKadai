package ev3_09_tank2;

import lejos.hardware.port.MotorPort;

public class Ev3Tank2 {
    static Tank tank = new Tank(MotorPort.B, MotorPort.C);
    
    public static void main(String[] args){
        tank.moveForMs(500, 500, 3000);
    }
}
