package game;

import body.control.Wheel;
import body.measure.Course;
import game.run.OnOff;
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
    Course course;
    Wheel wheel;
    OnOff onOff;

    private Game() {
        this.leftMotor = new EV3LargeRegulatedMotor(MotorPort.B);
        this.rightMotor = new EV3LargeRegulatedMotor(MotorPort.C);
        this.colorSensor = new EV3ColorSensor(SensorPort.S3);
        this.course = new Course(colorSensor);
        this.wheel = new Wheel(leftMotor, rightMotor);
        this.onOff = new OnOff(course, wheel, 200.0f);
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
        course.update();
        onOff.run();
        wheel.control();

        return false;
    }

    public void countUp() {
        count++;
    }
}
