package task;

import game.Game;

/**
 * ���O�^�X�N
 * 
 * @author �㓡 ����
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
