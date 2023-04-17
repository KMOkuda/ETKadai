package task;

import lejos.hardware.lcd.LCD;

/**
 * ログタスク
 * 
 * @author 後藤 聡文
 *
 */
public class LogTask extends Thread {

    // タスクの呼び出し回数
    private int count;

    public LogTask() {
        this.count = 0;
    }

    @Override
    public void run() {
        count++;
        LCD.drawString("LogTask ", 0, 5);
        LCD.drawString(Integer.toString(count), 10, 5);
    }
}