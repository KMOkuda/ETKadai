package ev3Sensor;

import lejos.hardware.port.Port;
import lejos.hardware.sensor.SensorMode;
import lejos.hardware.sensor.BaseSensor;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.hardware.sensor.EV3GyroSensor;

public class EV3Sensor {
    
    BaseSensor ev3Sensor;
    SensorMode sensorMode;
    EV3GyroSensor gyroSensor;
    
    // センサーの値を入れる配列
    float value[];
    
    public EV3Sensor(int sensorType,Port port,int mode) {
        // センサーを作成
        switch (sensorType) {
        case 1: // タッチセンサー
            ev3Sensor = new EV3TouchSensor(port);
            break;
        case 2: // カラーセンサー
            ev3Sensor = new EV3ColorSensor(port);
            break;
        case 3: // 超音波センサー
            ev3Sensor = new EV3UltrasonicSensor(port);
            break;
        case 4: // ジャイロセンサー
            gyroSensor = new EV3GyroSensor(port);
            break;
        default:
            break;
        }
        
        // モードを設定
        switch (sensorType) {
        case 4: // ジャイロセンサー
            sensorMode = gyroSensor.getMode(mode);
            break;
        default:
            sensorMode = ev3Sensor.getMode(mode);
            break;
        }

        value = new float[sensorMode.sampleSize()];
    }

    // センサーの値を取得
    public float getValue() {
    
        // センサーの値を読みとって配列に入れる
        sensorMode.fetchSample(value, 0);
        
        // 値を返す
        return value[0];
    }
}
