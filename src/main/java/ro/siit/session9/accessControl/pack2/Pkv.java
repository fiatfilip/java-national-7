package ro.siit.session9.accessControl.pack2;

import ro.siit.session9.accessControl.pack1.Car;

public class Pkv extends Car {

    public void setCapacity(int capacity){
        //protected
        this.cmc = capacity;
    }

}
