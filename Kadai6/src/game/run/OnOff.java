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
     * ‘–s‚·‚é
     */
    public void run() {
        // –Ú•W‹P“x’l‚ğæ“¾‚·‚é
        float target = course.getTarget();

        // ˜H–Ê‚Ì‹P“x’l‚ğæ“¾‚·‚é
        float brightness = course.getBrightness();

        // ù‰ñŠp‘¬“x‚ğŒvZ‚·‚é
        if (brightness < target) {
            turn = INITIAL_TURN;
        } else {
            turn = -INITIAL_TURN;
        }

        // Šp‘¬“x‚ğİ’è‚·‚é
        wheel.setForward(forward);
        wheel.setTurn(turn);
    }
}
