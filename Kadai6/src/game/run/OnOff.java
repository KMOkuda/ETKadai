package game.run;

import body.control.Wheel;
import body.measure.Course;

public class OnOff {
    private Course course;
    private Wheel wheel;

    private float forward;
    private float turn;
    final float INITIAL_TURN = 100.0f;

    public OnOff(Course course, Wheel wheel, float forward) {
        this.course = course;
        this.wheel = wheel;
        this.forward = forward;
        this.turn = 0.0f;
    }

    /**
     * 走行する
     */
    public void run() {
        // 目標輝度値を取得する
        float target = course.getTarget();

        // 路面の輝度値を取得する
        float brightness = course.getBrightness();

        // 旋回角速度を計算する
        if (brightness < target) {
            turn = INITIAL_TURN;
        } else {
            turn = -INITIAL_TURN;
        }

        // 角速度を設定する
        wheel.setForward(forward);
        wheel.setTurn(turn);
    }
}
