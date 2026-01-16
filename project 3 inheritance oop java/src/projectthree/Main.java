package projectthree;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MonitoringSystem sys = new MonitoringSystem("Factory Floor Monitor");

        TemperatureSensor t1 = new TemperatureSensor("T-100", "Boiler Room", 20.0, 90.0);
        TemperatureSensor t2 = new TemperatureSensor("T-200", "Storage", -5.0, 30.0);
        MotionSensor m1 = new MotionSensor("M-10", "Loading Bay", 0.2);

        sys.addSensor(t1);
        sys.addSensor(t2);
        sys.addSensor(m1);

        // Simulate periodic polling 3 times
        for (int i = 0; i < 3; i++) {
            sys.pollAll();
            Thread.sleep(1000);
        }
    }
}
