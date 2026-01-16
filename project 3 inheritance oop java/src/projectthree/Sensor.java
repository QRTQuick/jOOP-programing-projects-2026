package projectthree;

public abstract class Sensor {
    private String id;
    private String location;

    public Sensor(String id, String location) {
        this.id = id;
        this.location = location;
    }

    public String getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }

    public String getType() {
        return this.getClass().getSimpleName();
    }

    // Returns a numeric reading; concrete sensors decide units/meaning
    public abstract double readValue();

    @Override
    public String toString() {
        return "Sensor{id='" + id + "', type='" + getType() + "', location='" + location + "'}";
    }
}
