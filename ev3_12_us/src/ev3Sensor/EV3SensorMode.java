package ev3Sensor;

public interface EV3SensorMode {
    // タッチセンサー
    public static final int TOUCHMODE = 0;  // タッチモード
    // カラーセンサー
    public static final int COLORMODE = 0;  // 色モード
    public static final int REFLECTMODE = 1;// 反射光モード
    public static final int AMBIENTMODE = 3;// 周辺光モード
    // ジャイロセンサー
    public static final int ANGLEMODE = 1;  // 角度モード
    public static final int RATEMODE = 0;   // 角速度モード
    // 超音波センサー
    public static final int DISTANCEMODE = 0;   // 距離モード（メートル）
    public static final int LISTENMODE = 1;     // 存在モード
}
