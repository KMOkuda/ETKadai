package task;

import game.Game;
import game.Log;

/**
 * ���O�^�X�N
 * 
 * @author �㓡 ����
 *
 */
public class LogTask extends Thread {

    private Game game;
    private Log log;

   
    public LogTask(Game game, Log log){
        this.game = game;
        this.log = log;
        log.setGame(game);
        }


    @Override
    public void run() {
        log.countUp();
        log.disp();
    }
}
