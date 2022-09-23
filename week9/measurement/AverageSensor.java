package week9.measurement;

import week7.Dictionary;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor{
    private boolean isOn;
    private List<Sensor> sensors;
    private List<Integer> measurements;

    public AverageSensor() {
        this.sensors = new ArrayList<Sensor>();
    }
    public void addSensor(Sensor additional) {
        // which adds a new sensor to the AverageSensor.
        this.sensors.add(additional);
    }


    @Override
    public boolean isOn() {
        return this.isOn;
    }

    @Override
    public void on() {
        for (Sensor sensor: this.sensors) {
            if (!sensor.isOn()) {
                sensor.on();
            }
        }
        this.isOn = true;
    }


    @Override
    public void off() {
        for (Sensor sensor: this.sensors) {
            if(sensor.isOn()){
                sensor.off();
            }
        }
        this.isOn = false;
    }

    @Override
    public int measure() {
        if (this.isOn()) {
            this.measurements = new ArrayList<Integer>();
            for (Sensor sensor : this.sensors) {
                int measurement = sensor.measure();
                this.measurements.add(measurement);
            }
            int sum = 0;
            for (Integer measurement : this.measurements) {
                sum += measurement;
            }
            int average = (sum / measurements.size());
            return average;
        } else {
            throw new IllegalStateException("Average theremometer can measure if all senosrs are on");
        }
    }
}
