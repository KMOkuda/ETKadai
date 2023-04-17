package game;

import lejos.hardware.lcd.LCD;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;

/**
 * ���Z�N���X �C���X�^���X��P��ɂ��邽�߁ASingleton �p�^�[�����̗p
 * 
 * @author �㓡 ����
 *
 */
public class Game {
    // �^�X�N�̌Ăяo����
    private int count;

    private static Game instance = new Game();

    EV3LargeRegulatedMotor leftMotor;
    EV3LargeRegulatedMotor rightMotor;
    EV3ColorSensor colorSensor;

    private Game() {
        this.leftMotor = new EV3LargeRegulatedMotor(MotorPort.B);
        this.rightMotor = new EV3LargeRegulatedMotor(MotorPort.C);
        this.colorSensor = new EV3ColorSensor(SensorPort.S3);
    }

    public static Game getInstance() {
        return instance;
    }

    /**
     * ���{����
     * 
     * @return ���{���� false�A�I������ true ��Ԃ�
     */
    public boolean run() {

        // �ڕW�P�x�l���擾����
        float white = 0.4f;
        float black = 0.0f;
        float target = (white + black) / 2.0f;

        // �H�ʂ̋P�x�l���擾����
        float value[] = new float[colorSensor.getRedMode().sampleSize()];
        colorSensor.getRedMode().fetchSample(value, 0);
        float brightness = value[0];

        // �O�i�p���x�E����p���x���v�Z����
        final float INITIAL_TURN = 100.0f;
        float forward = 200.0f;
        float turn = 0.0f;
        if (brightness < target) {
            turn = INITIAL_TURN;
        } else {
            turn = -INITIAL_TURN;
        }

        // ���s����
        float leftSpeed = forward - turn;
        float rightSpeed = forward + turn;
        leftMotor.setSpeed(leftSpeed);
        rightMotor.setSpeed(rightSpeed);
        if (leftSpeed >= 0) {
            leftMotor.forward();
        } else {
            leftMotor.backward();
        }
        if (rightSpeed >= 0) {
            rightMotor.forward();
        } else {
            rightMotor.backward();
        }

        // ��ʕ\��
        LCD.clear();
        LCD.drawString("RUN", 0, 0);
        LCD.drawString("White", 0, 2);
        LCD.drawString(Float.toString(white), 11, 2);
        LCD.drawString("Black", 0, 3);
        LCD.drawString(Float.toString(black), 11, 3);
        LCD.drawString("Target", 0, 4);
        LCD.drawString(Float.toString(target), 11, 4);
        LCD.drawString("Brightness", 0, 5);
        LCD.drawString(Float.toString(brightness), 11, 5);
        LCD.drawString("Forward", 0, 6);
        LCD.drawString(Float.toString(forward), 11, 6);
        LCD.drawString("Turn", 0, 7);
        LCD.drawString(Float.toString(turn), 11, 7);
        return false;
    }

    public void countUp() {
        count++;
    }

}
