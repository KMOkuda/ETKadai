package ev3_01_hello;

import lejos.hardware.lcd.LCD;
import lejos.utility.Delay;

public class HelloWorld {

    public static void main(String[] args) {
        // TODO �����������ꂽ���\�b�h�E�X�^�u
        LCD.drawString("Hello World!", 0, 3);
        Delay.msDelay(3000);
    }

}
