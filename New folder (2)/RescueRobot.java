public class RescueRobot implements
        Flyable, Drivable, ThermalSensor, Communicable {

    private String deviceId;
    private Battery battery;
    private GPSTracker gps;
    private ThermalCamera thermal;

    public RescueRobot(String deviceId) {
        this.deviceId = deviceId;
        this.battery = new Battery(100);
        this.gps = new GPSTracker();
        this.thermal = new ThermalCamera();
    }

    // ===== Flyable =====
    @Override
    public void takeOff() {
        battery.drain(5);
        System.out.println("Robot taking off...");
    }

    @Override
    public void land() {
        battery.drain(3);
        System.out.println("Robot landing...");
    }

    @Override
    public double maxAltitude() {
        return 1000;
    }

    // ===== Drivable =====
    @Override
    public void startEngine() {
        battery.drain(4);
        System.out.println("Engine started");
    }

    @Override
    public void stopEngine() {
        battery.drain(2);
        System.out.println("Engine stopped");
    }

    @Override
    public double maxSpeed() {
        return 60;
    }

    // ===== ThermalSensor =====
    @Override
    public double readTemperatureC() {
        battery.drain(1);
        return thermal.readTemperatureC();
    }

    @Override
    public boolean detectHuman(double thresholdC) {
        battery.drain(2);
        return thermal.detectHuman(thresholdC);
    }

    // ===== Communicable =====
    @Override
    public void send(String message) {
        battery.drain(1);
        System.out.println(
            "ID=" + deviceId +
            ", POS=" + gps.currentPosition() +
            ", MSG=" + message
        );
    }

    @Override
    public String getDeviceId() {
        return deviceId;
    }

    // ===== แก้ default method ชื่อชนกัน =====
    @Override
    public String status() {
        return "ROBOT: " +
                Flyable.super.status() +
                " + " +
                Drivable.super.status();
    }

    // helper
    public void updatePosition(double lat, double lon) {
        gps.updatePosition(lat, lon);
    }
}
