package task;

import lejos.hardware.Button;
import lejos.hardware.lcd.LCD;

import java.util.concurrent.CountDownLatch;

import javax.swing.text.DefaultEditorKit.BeepAction;

public class GameTask extends Thread{
    private CountDownLatch countDownLatch;
    private int count;
    
    public GameTask(CountDownLatch countDownLatch){
        this.countDownLatch = countDownLatch;
        this.count = 0;
    }
    
    @Override
    public void run(){
        if(Button.ESCAPE.isDown()){
            countDownLatch.countDown();
            Beep.ring();
        }
        count++;
        LCD.drawString("GameTask ", 0, 4);
        LCD.drawString(Integer.toString(count), 10, 4);
    }
}
