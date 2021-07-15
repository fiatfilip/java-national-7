package ro.siit.session10.abstractClasses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Sorter {
    protected List<Double> numbers = new ArrayList<>();

    /**
     * Should populate the initial list
     */
    public abstract void init();


    public List<Double> getSorted(){
        Collections.sort(numbers);
        return numbers;
    }

    public void print(){
        for (Double elem: numbers) {
            System.out.println(elem);
        }
    }
}
