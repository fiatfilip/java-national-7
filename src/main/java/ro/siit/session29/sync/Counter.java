package ro.siit.session29.sync;

public class Counter {
    public static int count;

    public static synchronized void increment(){
        //count++;
        count = count + 1;
    }
}
