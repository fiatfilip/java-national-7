package ro.siit.session14.composition;

import java.awt.*;
import java.util.ArrayList;

import java.util.List;

public class Bike {
    private Frame frame;
    private List<Wheel> wheels = new ArrayList<>();

    public void setFrame(Frame frame) {
        this.frame = frame;
    }

    public void addWheel(Wheel wheel) {
        this.wheels.add(wheel);
    }

    public static class Wheel{
        private int size;
        private Color color;

        public Wheel(int size) {
            this.size = size;
        }

        public void setColor(Color color) {
            this.color = color;
        }

        public Color getColor() {
            return color;
        }

        @Override
        public String toString() {
            return "Wheel{" +
                    "size=" + size +
                    ", color=" + color +
                    '}';
        }
    }

    public class Frame{
        private Color color;
        private String material;

        public Frame(String material, Color color) {
            this.material = material;
            this.color = color;
            for (Wheel wheel: wheels) {
                wheel.setColor(color);
            }
            frame = this;
        }

        @Override
        public String toString() {
            return "Frame{" +
                    "color=" + color +
                    ", material='" + material + '\'' +
                    '}';
        }
    }


    public List<Wheel> getWheels() {
        return wheels;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "frame=" + frame +
                ", wheels=" + wheels +
                '}';
    }
}
