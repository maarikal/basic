package week9.measurement;

public class ConstantSensor implements Sensor{
    private int measuredValue;

    public ConstantSensor(int measuredValue) {
        this.measuredValue = measuredValue;
    }

    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void on() {

    }

    @Override
    public void off()  throws IllegalStateException {

    }

    @Override
    public int measure() {
        return this.measuredValue;
    }
}
