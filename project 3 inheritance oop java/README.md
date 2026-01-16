# Project 3 — Inheritance OOP (Java)

Realtime-style monitoring example using inheritance:
- `Sensor` (abstract base)
- `TemperatureSensor` extends `Sensor`
- `MotionSensor` extends `Sensor`
- `MonitoringSystem` polls sensors periodically
- `Main` simulates polling

Compile and run (Windows PowerShell):

```powershell
cd "project 3 inheritance oop java"
javac -d out src\projectthree\*.java
java -cp out projectthree.Main
```

This will simulate a small monitoring system polling sensors three times and printing readings with timestamps.
