package ro.siit.session14.composition;

import org.junit.Assert;
import org.junit.Test;

import java.awt.*;

public class TestBike {
    @Test
    public void testWheelsGetFrameColor(){
        Color testColor = Color.MAGENTA;
        int noOfWheels = 10;
        Bike testBike = new Bike();
        for (int i = 0; i < noOfWheels; i++) {
            Bike.Wheel wheel = new Bike.Wheel(20);
            testBike.addWheel(wheel);
        }

        Bike.Frame testFrame = testBike.new Frame("Steel", testColor);
        testBike.setFrame(testFrame);

        for (Bike.Wheel wheel: testBike.getWheels()) {
            Assert.assertEquals(testColor, wheel.getColor());
        }
    }
}
