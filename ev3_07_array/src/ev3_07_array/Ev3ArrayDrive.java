package ev3_07_array;

import lejos.hardware.lcd.LCD;
import lejos.utility.Delay;

public class Ev3ArrayDrive {
    public static void main(String[] arg){
        String val[] = {"a", "b", "c"};
        
        for(int i = 0; i < val.length; i++){
            LCD.drawString(val[i], 0, i * 2 + 1);
            Delay.msDelay(3000);
        }
        
    }
}
