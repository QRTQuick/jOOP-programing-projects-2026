package projectthree;

import java.util.concurrent.ThreadLocalRandom;

public class TemperatureSensor extends Sensor {
    private double minCelsius;
    private double maxCelsius;

    public TemperatureSensor(String id, String location, double minCelsius, double maxCelsius) {
        super(id, location);
        this.minCelsius = minCelsius;
        this.maxCelsius = maxCelsius;
    }

    @Override
    public double readValue() {
        return ThreadLocalRandom.current().nextDouble(minCelsius, maxCelsius);
    }

    public String readAsString() {
        return String.format("%.2f°C", readValue());
    }
}
