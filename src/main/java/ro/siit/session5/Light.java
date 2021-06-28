package ro.siit.session5;

enum LightState {
    On,
    Off,
    Broken
}

public class Light {

    private float intensityPercent = 0;

    private int currentFlow = 0;

    private int maximumVoltage = 100;

    private LightState state = LightState.Off;

    public Light() {

    }

    public void on() {
        state = LightState.On;
        intensityPercent = 1;
    }

    public void off() {
        state = LightState.Off;
        intensityPercent = 0;
    }

    public void dim() {
        if (state != LightState.Broken && intensityPercent > 1 && state != LightState.Off) {
            intensityPercent--;
            currentFlow--;
        }
    }

    public void brighten() {

        currentFlow++;

        if (state != LightState.Broken && state != LightState.Off) {
            if (currentFlow > maximumVoltage) {
                state = LightState.Broken;
                intensityPercent = 0;
            } else {
                intensityPercent = (100f * (float) currentFlow) / (float) maximumVoltage;
            }
        }
    }

    public float getIntensityPercent() {
        return intensityPercent;
    }

    public int getCurrentFlow() {
        return currentFlow;
    }

    public LightState getState() {
        return state;
    }

    public void setMaximumVoltage(int max) {
        maximumVoltage = Math.max(max, 0);
    }
}
