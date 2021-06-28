package ro.siit.session5;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Light bulb = new Light();

        bulb.on();

        while(bulb.getIntensity() < 105){
            bulb.brighten();
        }

        System.out.println("Intesitatea becului este " + bulb.getIntensity() + bulb.getState());

        bulb.off();

    }
}
