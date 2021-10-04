package ro.siit.session29;

import java.util.Scanner;

public class EchoThread extends Thread{
    @Override
    public void run() {
        Scanner keyboard = new Scanner(System.in);
        while(true){
            String word = keyboard.nextLine();
            if("EXIT".equalsIgnoreCase(word)) {
                System.exit(0);
            }
            System.out.println("ECHO: " + word);
        }
    }
}
