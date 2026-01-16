package projectthree;

import java.util.concurrent.ThreadLocalRandom;

public class MotionSensor extends Sensor {
    private double sensitivity; // 0.0 - 1.0 probability of detecting motion

    public MotionSensor(String id, String location, double sensitivity) {
        super(id, location);
        this.sensitivity = Math.max(0.0, Math.min(1.0, sensitivity));
    }

    @Override
    public double readValue() {
        // return 1.0 when motion detected, 0.0 otherwise
        boolean motion = ThreadLocalRandom.current().nextDouble() < sensitivity;
        return motion ? 1.0 : 0.0;
    }

    public boolean isMotionDetected() {
        return readValue() == 1.0;
    }
}
