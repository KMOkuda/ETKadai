package task;

import lejos.hardware.lcd.LCD;

/**
 * ���O�^�X�N
 * 
 * @author �㓡 ����
 *
 */
public class LogTask extends Thread {

    // �^�X�N�̌Ăяo����
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