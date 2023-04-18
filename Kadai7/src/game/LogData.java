package game;

import game.Game.STATUS;

/**
 * ログデータ（一件分）クラス
 * 
 * @author 後藤 聡文
 */

public class LogData {
    private int count;
    private STATUS status;
    private float brightness;
    private float forward;
    private float turn;

    public LogData(int count, STATUS status, float brightness, float forward, float turn) {
        this.count = count;
        this.status = status;
        this.brightness = brightness;
        this.forward = forward;
        this.turn = turn;
    }

    public int getCount() {
        return count;
    }

    public STATUS getStatus() {
        return status;
    }

    public float getBrightness() {
        return brightness;
    }

    public float getForward() {
        return forward;
    }

    public float getTurn() {
        return turn;
    }
}