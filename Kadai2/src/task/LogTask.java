package task;

import game.Game;

/**
 * ログタスク
 * 
 * @author 後藤 聡文
 *
 */
public class LogTask extends Thread {

    private Game game;

    public LogTask(Game game) {
        this.game = game;
    }

    @Override
    public void run() {
    }
}
