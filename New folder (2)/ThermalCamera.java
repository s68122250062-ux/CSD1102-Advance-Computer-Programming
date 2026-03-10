import java.util.Random;

public class ThermalCamera {
    private Random rand = new Random();

    public double readTemperatureC() {
        return 30 + rand.nextDouble() * 10; // 30 - 40 C
    }

    public boolean detectHuman(double thresholdC) {
        return readTemperatureC() >= thresholdC;
    }
}
