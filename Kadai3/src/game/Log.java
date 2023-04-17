package game;

import lejos.hardware.lcd.LCD;

/**
 * ログクラス インスタンスを単一にするため、Singleton パターンを採用
 * 
 * @author 後藤 聡文
 *
 */
public class Log {
    // タスクの呼び出し回数
    private int count;

    private static Log instance = new Log();

    private Game game;

    private Log() {
    }

    public static Log getInstance() {
        return instance;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public void disp() {
        countUp();
        LCD.drawString("LogTask ", 0, 5);
        LCD.drawString(Integer.toString(count), 10, 5);
        
        
        
     // 画面表示
        LCD.clear();
        LCD.drawString("RUN", 0, 0);
        LCD.drawString("White", 0, 2);
        LCD.drawString(Float.toString(game.course.getWhite()), 11, 2);
        LCD.drawString("Black", 0, 3);
        LCD.drawString(Float.toString(game.course.getBlack()), 11, 3);
        LCD.drawString("Target", 0, 4);
        LCD.drawString(Float.toString(game.course.getTarget()), 11, 4);
        LCD.drawString("Brightness", 0, 5);
        LCD.drawString(Float.toString(game.course.getBrightness()), 11, 5);
        LCD.drawString("Forward", 0, 6);
        LCD.drawString(Float.toString(game.wheel.getForward()), 11, 6);
        LCD.drawString("Turn", 0, 7);
        LCD.drawString(Float.toString(game.wheel.getTurn()), 11, 7);
    }

    public void countUp() {
        count++;
    }
}