package ro.siit.session5;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Light bulb = new Light();

        bulb.setMaximumVoltage(120);

        bulb.on();

        while (bulb.getCurrentFlow() < 80) {
            bulb.brighten();
        }

        System.out.println("Intesitatea luminoasă a becului este: " + bulb.getIntensityPercent() + "%");
        System.out.println("Starea becului este: " + bulb.getState().name());
        System.out.println("Valoarea curentului este: " + bulb.getCurrentFlow());

        bulb.off();

    }
}
