public class Battery {
    private double percent;

    public Battery(double percent) {
        this.percent = percent;
    }

    public void drain(double amount) {
        percent -= amount;
        if (percent < 0) percent = 0;
    }

    public void charge(double amount) {
        percent += amount;
        if (percent > 100) percent = 100;
    }

    public double getPercent() {
        return percent;
    }
}
