package ro.siit.session14.composition;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Bike.Wheel frontWheel = new Bike.Wheel(25);
        Bike.Wheel rearWheel = new Bike.Wheel(27);

        Bike myBike = new Bike();
        myBike.addWheel(frontWheel);
        myBike.addWheel(rearWheel);
        Bike.Frame expensiveFrame = myBike.new Frame("Alloy", Color.BLACK);
        // Bike myBike = new Bike();
        myBike.setFrame(expensiveFrame);
//        myBike.addWheel(frontWheel);
//        myBike.addWheel(rearWheel);

        System.out.println(myBike);
    }
}
