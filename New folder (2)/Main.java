public class Main {
    public static void main(String[] args) {

        RescueRobot robot = new RescueRobot("RR-01");

        robot.updatePosition(13.7563, 100.5018);

        robot.takeOff();
        System.out.println(robot.status());
        robot.land();

        robot.startEngine();
        System.out.println("Max speed = " + robot.maxSpeed());
        robot.stopEngine();

        double temp = robot.readTemperatureC();
        System.out.println("Temperature = " + temp);

        System.out.println(
            "Detect human: " + robot.detectHuman(36.5)
        );

        robot.send("Found hotspot...");
    }
}
