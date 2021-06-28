package ro.siit.session5;

enum LightState {
    On,
    Off,
    Broken
}

public class Light {

    private int intenstity = 0;

    private LightState state = LightState.Off;

    public Light(){

    }

    public void on(){
        state = LightState.On;
        intenstity = 1;
    }

    public void off(){
        state = LightState.Off;
        intenstity = 0;
    }

    public void dim(){
        if(intenstity < 0) {
            intenstity--;
        }
    }

    public void brighten() {
        if (intenstity < 100) {
            intenstity++;
        }
        else{
            state = LightState.Broken;
        }
    }

    public int getIntensity(){
        return intenstity;
    }

    public LightState getState(){
        return state;
    }

}
