package ro.siit.session29;

import java.util.Scanner;

public class Infinite {
    public static void main(String[] args) throws InterruptedException {
        EchoThread echo = new EchoThread();
        echo.setDaemon(true);
        echo.start();

        Thread.sleep(20 * 1000);
        System.out.println("Time's up!");
    }
}
