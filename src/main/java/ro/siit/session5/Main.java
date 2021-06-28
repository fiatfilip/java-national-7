package ro.siit.session5;

public class Main {

    private static Light bulb = new Light();

    public static void main(String[] args) {
	// write your code here

        bulb.setMaximumVoltage(120);

        bulb.on();

        while (bulb.getCurrentFlow() < 120) {
            bulb.brighten();
        }
        printLightBulbStatus();

        while (bulb.getCurrentFlow() != 1){
            bulb.dim();
        }

        printLightBulbStatus();

        bulb.off();
    }

    private static void printLightBulbStatus(){
        System.out.println("Intesitatea luminoasă a becului este: " + bulb.getIntensityPercent() + "%");
        System.out.println("Starea becului este: " + bulb.getState().name());
        System.out.println("Valoarea curentului este: " + bulb.getCurrentFlow());
    }
}
