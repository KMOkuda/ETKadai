package sample_01;

import lejos.hardware.lcd.LCD;
import lejos.utility.Delay;

public class Sample_01 {

    public static void main(String[] args) {
        LCD.drawString("Hello!", 0, 3);
        Delay.msDelay(3000);
        LCD.drawString("Bye!", 0, 5);
        Delay.msDelay(3000);
    }

}
