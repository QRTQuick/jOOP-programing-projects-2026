package projectthree;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class MonitoringSystem {
    private String name;
    private List<Sensor> sensors = new ArrayList<>();
    private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public MonitoringSystem(String name) {
        this.name = name;
    }

    public void addSensor(Sensor s) {
        sensors.add(s);
        System.out.println("Added sensor: " + s);
    }

    public void pollAll() {
        String ts = LocalDateTime.now().format(dtf);
        System.out.println("[" + ts + "] Polling all sensors (" + name + ")...");
        for (Sensor s : sensors) {
            double value = s.readValue();
            String out = String.format("%s (%s) @ %s => %.2f", s.getId(), s.getType(), s.getLocation(), value);
            System.out.println(out);
        }
    }
}
